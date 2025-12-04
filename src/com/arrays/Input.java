package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 54;
        arr[3] = 5;
        arr[4] = 98;
        System.out.println(arr[3]);


        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //o/p
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
// array of objects
    String[] str = new String[4];
        for(int i = 0; i< str.length;i++){
            str[i] = in.next();
        }
       System.out.println(Arrays.toString(str));

        // modify
        str[1] = "kunal";

        System.out.println(Arrays.toString(str));

    }
}