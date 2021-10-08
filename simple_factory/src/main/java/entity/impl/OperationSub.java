package entity.impl;

import entity.Operation;

public class OperationSub implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
