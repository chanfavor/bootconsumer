package com.cd.bootconsumer;

import model.User;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceApiFallBack implements HelloServiceConsumer{

    @Override
    public String hello(String s) {
        return null;
    }

    @Override
    public User queryUser(String s, int i) {
        return null;
    }

    @Override
    public String updateUser(User user) {
        return null;
    }
}
