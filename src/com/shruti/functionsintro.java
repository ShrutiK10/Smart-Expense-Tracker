package com.shruti;

import java.util.Scanner;

public class functionsintro {
    public static void main(String[] args) {
        sum();
        sum();
    }


    //Q: take input of 2 no. and print the sum
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int num1 = in.nextInt();
        System.out.println("enter 2nd no.");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum =" + sum);

    }
}

/*
return_type name () {
//body
return statement;
 */