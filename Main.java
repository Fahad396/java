package com.example;
class Arithmetic{
    int x,y;
    int add(int a, int b){
        x = a;
        y = b;
        int  sum = a+b;
        return sum;
    }
}
class adder extends Arithmetic{
}
public class Main {
    public static void main(String[] args) {
        adder ob = new adder();
         int sum1 = ob.add(10, 20);
        System.out.println("My superclass is: "+ob.getClass().getSuperclass().getName());
        System.out.println(ob.add(10, 32)+" "+ob.add(10,3)+" "+ob.add(10, 10)+"\n");
    }
}