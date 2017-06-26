package org.shoper.example.web;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by ShawnShoper on 2017/6/16.
 */

public class Bean {
    public static ConfigurableApplicationContext context;
    @Setter @Getter(AccessLevel.PUBLIC) private String name;
    @Setter @Getter private String age;
}
