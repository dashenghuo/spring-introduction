package introduction.aop;


public class CalculatorImpl1 implements Calculator {
    @Override
    public double add(double a, double b){
        System.out.println("input parameter: a " +  a +  ", b " + b);
        return a + b;
    }
    @Override
    public double sub(double a, double b){
        System.out.println("input parameter: a " +  a +  ", b " + b);
        return a - b;
    }
}
