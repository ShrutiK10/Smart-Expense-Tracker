package com.shruti;

import java.util.Scanner;

public class returnvalue {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int num1 = in.nextInt();
        System.out.println("enter 2nd no.");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
//yaha last mein jo return likha hai uska mtlb hai ki agr koi bhi statement iske baad likhenge toh run nhi hogi its over after return
/*
return_type name (arguments) {
//body
    return statement;
    */
