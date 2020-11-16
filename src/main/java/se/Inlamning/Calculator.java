package se.Inlamning;

public class Calculator {
    public int add (int a, int b ) { return a + b;}
    public int subtract (int a, int b) { return a - b;}
    public int multiply (int a, int b) { return a * b;}
    public int divide (int a, int b) { return a / b;}
    public static void main(String[] args) {
        System.out.println("5 + 5 is " + new Calculator().add(5,5) + ".");
        System.out.println("20 - 5 is " + new Calculator().subtract(20 ,5) + ".");
        System.out.println("10 * 2 is " + new Calculator().multiply(10,2) + ".");
        System.out.println("60 / 2 is " + new Calculator().divide(60,2) + ".");

    }

}
