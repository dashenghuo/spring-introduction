package introduction.aop.jdk;

import introduction.aop.Calculator;
import introduction.aop.CalculatorImpl;

public class JdkTest {

    public static void main(String[] args) {
        Calculator calculatorImpl = new CalculatorImpl();
        Calculator calculator = (Calculator) CalculatorLogJdkHandler.createProxy(calculatorImpl);

        calculator.add(1, 1);
        calculator.sub(1, 1);
    }
}
