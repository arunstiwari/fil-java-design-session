package com.fil.patterns.state;

public class OffState implements State {
    @Override
    public boolean doAction() {
        return false;
    }
}
