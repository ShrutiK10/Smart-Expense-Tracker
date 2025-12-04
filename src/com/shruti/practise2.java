package com.shruti;
import java.util.Scanner;

public class practise2 {

    static void Diamond1(int n){

     for(int i =1; i<=n;i++){
         for(int j=1;j<=n-i;j++){
             System.out.print(" ");
         }

         for(int k=1;k<= 2*i-1;k++){
             System.out.print("*");
         }
         System.out.println();
     }
    }

    static void Diamond2(int n){

      for(int i =n-1; i>=1;i--){
          for(int j =1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int k =1;k<=(2*i-1);k++){
              System.out.print("*");
          }

          System.out.println();
      }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int x = sc.nextInt();

        Diamond1(x);
        Diamond2(x);
    }
}
