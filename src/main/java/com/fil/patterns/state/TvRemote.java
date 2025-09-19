package com.fil.patterns.state;

public class TvRemote {
    private String state;

    public TvRemote(String state) {
        this.state = state;
    }

    public boolean doAction(){
        if(state.equalsIgnoreCase("OFF")){
            return false;
        } else if (state.equalsIgnoreCase("ON")) {
            return true;
        }else
            return false;
    }
}
