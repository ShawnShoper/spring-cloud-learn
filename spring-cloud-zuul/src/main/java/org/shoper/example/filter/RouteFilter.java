package org.shoper.example.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * Created by ShawnShoper on 2017/6/23.
 */
public class RouteFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
