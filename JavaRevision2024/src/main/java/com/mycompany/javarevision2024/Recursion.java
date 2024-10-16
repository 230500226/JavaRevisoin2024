/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarevision2024;

/**
 *
 * @author ldxt460s
 */
public class Recursion {

    public static void power(int base, int exponent) {
        double result = powerHelper(base, exponent);
        System.out.println("The power of the number is: " + result);
    }

    private static double powerHelper(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * powerHelper(base, exponent - 1);
        } else {
            return 1.0 / powerHelper(base, -exponent);
        }
    }

    public static void multiplication(int a, int b) {
        int result = multiplicationHelper(a, b);
        System.out.println("The multiplication of the two numbers is: " + result);
    }

    private static int multiplicationHelper(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicationHelper(a, b - 1);
        }
    }

    public static void counter(int n) {
        int result = counterHelper(n);
        System.out.println("The sum of the numbers from 1 to n is: " + result);
    }

    private static int counterHelper(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return n + counterHelper(n - 1);
        } else {
            return n + counterHelper(n + 1);
        }
    }

    public static void counterEven(int n) {
        int result = counterEvenHelper(n);
        System.out.println("The sum of the even numbers from 1 to n is: " + result);
    }

    private static int counterEvenHelper(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            if (n % 2 == 0) {
                return n + counterEvenHelper(n - 2);
            } else {
                return counterEvenHelper(n - 1);
            }
        } else {
            if (n % 2 == 0) {
                return n + counterEvenHelper(n + 2);
            } else {
                return counterEvenHelper(n + 1);
            }
        }
    }

    public static void counterOdd(int n) {
        int result = counterOddHelper(n);
        System.out.println("The sum of the odd numbers from 1 to n is: " + result);
    }

    private static int counterOddHelper(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            if (n % 2 != 0) {
                return n + counterOddHelper(n - 2);
            } else {
                return counterOddHelper(n - 1);
            }
        } else {
            if (n % 2 != 0) {
                return n + counterOddHelper(n + 2);
            } else {
                return counterOddHelper(n + 1);
            }
        }
    }
}
