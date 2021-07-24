package ec.epn.edu.git.GR2.calculator;

public class CalculatorExecute {
    public static void main(String[] args){
        System.out.println("==================Calculator Execute==================");
        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("c.addition(4,7) = " + addition);
        int substract = c.substraction(8,4);
        System.out.println("c.substraction(8,4) = " + substract);
    }
}
