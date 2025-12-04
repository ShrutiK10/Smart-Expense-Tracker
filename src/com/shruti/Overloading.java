package com.shruti;

public class Overloading {
    public static void main(String[] args) {
      //  fun(67);
     // fun("shruti kesarwani");
     int ans = sum(3,4,78);//2 no. lenge toh a+b wala execute hoga 3 no. lenge toh a+b+c wala execute hoga
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a + b ;
    }
    static int sum(int a, int b, int c){
        return a + b + c ;
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
//jbb 2 same function hoo prr unke arguments different hoo that is known as overloading