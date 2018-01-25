package service.impl;

import org.springframework.stereotype.Component;
import service.IMyService;

@Component
public class MyService implements IMyService {
    @Override
    public void hello() {
        System.out.println("hello world!");
    }
}
