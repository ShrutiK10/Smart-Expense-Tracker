package com.shruti;

import java.util.Scanner;

public class ques {

    static void binary(int n) {

        for(int i =1;i<=n;i++){
            int start = (i%2==0)?0:1;

            for(int j =1;j<=i;j++){
                System.out.print(start + " ");
                start = 1-start;

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int x = sc.nextInt();

        binary(x);
    }
}
