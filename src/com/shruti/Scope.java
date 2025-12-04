package com.shruti;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal" ;


        {
            a=100; //yaha a ko new value de rhe hai
            System.out.println(a);
            int c = 99;
            //values initialised in this block will remain in block
            name = "Rahul" ; //name ko  new value mil gyi hai [o/p--> Rahul]
            System.out.println(name);
        }
       // System.out.println(marks);
        System.out.println(a);
        //cannot use outside block   System.out.println(c);
        System.out.println(name); //[o/p--> Rahul]
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks); //marks function ke andar marks likhenge tohh o/p ayega otherwise kahi likhne prr error dega
    }
}
