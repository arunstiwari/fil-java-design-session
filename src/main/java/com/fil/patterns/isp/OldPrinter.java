package com.fil.patterns.isp;

public class OldPrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
