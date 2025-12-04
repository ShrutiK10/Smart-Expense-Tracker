package com.arrays;

import java.util.Scanner;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(65);
        list.add(64);
        list.add(69);
        list.add(47);

        System.out.println(list.contains(69));
        System.out.println(list);
        System.out.println(list.contains(66));

        list.set(0,99);
        System.out.println(list);

       list.remove(2);
        System.out.println(list);

        //input
        for(int i = 0;i < 5;i++){
            list.add(in.nextInt());
        }
       // get item at any index
        for(int i = 0;i < 5;i++){
            System.out.println(list.get(i)); //pass index here , list[index] syntax will not work here
        }

        System.out.println(list);


    }
}
