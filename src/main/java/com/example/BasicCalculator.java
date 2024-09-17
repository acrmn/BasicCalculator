package com.example;

public class BasicCalculator {

    public static void main(String[] args) {

        System.out.println("Calculations...");

        System.out.println("5 + 3 = ");
        int addResult = add(5, 3);
        System.out.println(addResult);

        System.out.println("100 - 2 = ");
        int subtractResult = subtract(100, 2);
        System.out.println(subtractResult);

        System.out.println("7 * 3 = ");
        int multiplyResult = multiply(7, 3);
        System.out.println(multiplyResult);

        System.out.println("25 / 5 = ");
        int divideResult = divide(25, 5);
        System.out.println(divideResult);
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

}



