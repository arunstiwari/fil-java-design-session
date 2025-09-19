package com.fil.patterns.state;

import com.fil.patterns.srp.NotificationService;

public class DemoService {
    private DummyService dummyService = new DummyService();

    public void demo(){
        try {
            dummyService.dummyEvent();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
