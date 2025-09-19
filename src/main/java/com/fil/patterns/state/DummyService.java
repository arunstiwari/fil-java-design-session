package com.fil.patterns.state;

public class DummyService {
    public void dummyEvent() throws Exception {
        System.out.println("Dummy event");
        throw new Exception("Dummy Event support not available");
    }
}
