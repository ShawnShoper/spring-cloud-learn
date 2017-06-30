package org.shoper.example;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.shoper.example.feignclient.api.User;
import org.shoper.example.feignclient.api.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

/**
 * Created by ShawnShoper on 2017/6/26.
 */
@Service
public class AggregationService {
    @Autowired
    UserClient userClient;
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserById(String uid) {
        return Observable.create(obs -> {
//            User user = restTemplate.getForObject("http://user-service/user/" + uid, User.class, uid);
            User user = userClient.findUserById(uid);
            obs.onNext(user);
            obs.onCompleted();
        });
    }
    @HystrixCommand(fallbackMethod = "fallback1")
    public Observable<Ticket> getTicketByUserId(String uid) {
        return Observable.create(obs -> {
            Ticket ticket = restTemplate.getForObject("http://ticket-service/ticket/" + uid, Ticket.class, uid);
            obs.onNext(ticket);
            obs.onCompleted();
        });
    }
    public User fallback(String id){
        User user = new User();
        user.setId("-1");
        return user;
    }
    public Ticket fallback1(String id){
        Ticket user = new Ticket();
        user.setId("-1");
        return user;
    }
}
