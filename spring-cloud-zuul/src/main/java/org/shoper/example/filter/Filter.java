package org.shoper.example.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ShawnShoper on 2017/6/14.
 */
@Component
public class Filter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        System.out.println("1231231231");
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getZuulRequestHeaders().put("w","q");
//        HttpServletRequest request = ctx.getRequest();
//        Object accessToken = request.getParameter("accessToken");
//        if(accessToken == null) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        return null;
    }

}
