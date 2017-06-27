package org.shoper.example.feignclient.api;

/**
 * Created by ShawnShoper on 2017/6/27.
 */
public class User {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
