package mamba.backend.calculator;

public class addition implements Calculator {

    public addition() {
    }

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
