package org.shoper.example.web;

import com.daqsoft.commons.responseEntity.BaseResponse;
import com.daqsoft.commons.responseEntity.ResponseBuilder;
import org.shoper.example.AggregationService;
import org.shoper.example.UserTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.Observer;

/**
 * Created by ShawnShoper on 2017/6/16.
 */
@RestController
public class MergeController {
    @Autowired
    private AggregationService aggregationService;

    @GetMapping("user-ticket")
    public BaseResponse aggregate(String id) {
        Observable<UserTicket> result = this.aggregateObservable(id);
        DeferredResult<UserTicket> userTicketDeferredResult = this.toDeferredResult(result);
        return ResponseBuilder.custom().data(userTicketDeferredResult.getResult()).success().build();
    }

    public Observable<UserTicket> aggregateObservable(String id) {
        return Observable.zip(this.aggregationService.getUserById(id), this.aggregationService.getTicketByUserId(id), (user, ticket) -> {
            UserTicket map = new UserTicket();
            map.setUser(user);
            map.setTicket(ticket);
            return map;
        });
    }

    public DeferredResult<UserTicket> toDeferredResult(Observable<UserTicket> details) {
        DeferredResult result = new DeferredResult();
        details.subscribe(new Observer<UserTicket>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("completed");
            }

            @Override
            public void onNext(UserTicket stringObjectHashMap) {
                result.setResult(stringObjectHashMap);
            }
        });
        return result;
    }
}
