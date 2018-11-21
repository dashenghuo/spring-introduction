package introduction.aop.cglib;

import introduction.aop.CalculatorImpl;

public class CglibTest {

    public static void main(String[] args) {
        CalculatorLogCglibProxy proxy = new CalculatorLogCglibProxy();
        CalculatorImpl calculatorImpl = (CalculatorImpl) proxy.getInstance(new CalculatorImpl());
        calculatorImpl.add(1, 1);
        calculatorImpl.sub(1, 1);
    }
}
