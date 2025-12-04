package com.shruti;
import java.util.Scanner;


public class practise1 {

    static void floyds(int n){
        int num =1;
       for(int i=1; i<=n; i++){
           for(int j=1;j<i;j++){
               System.out.print(num + " ");
               num++;
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int x = sc.nextInt();
     floyds(x);



    }
}
