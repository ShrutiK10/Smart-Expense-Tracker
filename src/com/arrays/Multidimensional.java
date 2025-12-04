package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9

         */
   //     int[][] arr = new int[3][];

    //    int[][] arr = {
        //           {1, 2, 3}, //0th index
    //            {4, 5}, //1st index
        //         {6, 7, 8, 9} //2nd index --> arr2D[2] = {6, 7, 8, 9}
    //    };

      Scanner in = new Scanner(System.in);
        int[][] x = new int[3][3];
        System.out.println(x.length); // no. of rows

        //input
        for(int row = 0; row < x.length; row++){
                //for each col in every row
                for(int col =0 ; col < x[row].length; col++) { //har row ke andar ke cols ke liye
                    x[row][col] = in.nextInt();
                }
            }

        //output
        for(int row = 0; row < x.length; row++){
            //for each col in every row
            for(int col =0 ; col < x[row].length; col++){
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
        //alternate way of output
        for(int row = 0; row < x.length;row++){
            System.out.println(Arrays.toString(x[row]));
        }
     for(int[] a : x){
         System.out.println(Arrays.toString(a));
     }
    }
}
