package com.github.kiolk.calculator.utils;

import com.github.kiolk.calculator.ui.MainActivity;

import java.util.Arrays;
import java.util.Scanner;

public class Calculation {

    public static String calculate(String input) {
        //TODO need implemented

        String[] numbers = input.split("[-+*/]");
        String[] operators = input.split("\\d+");
        int res = Integer.valueOf(numbers[0]);

        for (int i = 1; i < operators.length; i++) {
            if (operators[i].compareTo("+") == 0) {
                res = sum(res, Integer.valueOf(numbers[i]));
            }
            if (operators[i].compareTo("-") == 0) {
                res = minus(res,Integer.valueOf(numbers[i]));
            }
            if (operators[i].compareTo("/") == 0) {
                res = divide(res, Integer.valueOf(numbers[i]));
            }
            if (operators[i].compareTo("*") == 0) {
                res = multiply(res,Integer.valueOf(numbers[i]));
            }
        }
        String s = String.valueOf(res);
        return s;
    }
    public static int sum(int a, int b) {
        //TODO need implemented
        return a+b;
    }

    public static int minus(int a, int b) {
        //TODO need implemented
        return a-b;
    }

    public static int multiply(int a, int b) {
        //TODO need implemented
        return a*b;
    }

    public static int divide(int a, int b) {
        //TODO need implemented
        return a/b;
    }
}
