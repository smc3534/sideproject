package mamba.backend.calculator;

public class minus implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
