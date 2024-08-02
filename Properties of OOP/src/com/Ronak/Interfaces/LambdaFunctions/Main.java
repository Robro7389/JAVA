package com.Ronak.Interfaces.LambdaFunctions;

public class Main {
    public static void main(String[] args) {
        Operation sum = ((a, b) -> a + b);
        Operation diff = ((a, b) -> a - b);
        Operation prod = ((a, b) -> a * b);

        Main myCal = new Main();
        System.out.println(myCal.operate(5,3,sum));
        System.out.println(myCal.operate(5,3,diff));
        System.out.println(myCal.operate(5,3,prod));
    }
    private int operate(int a,int b,Operation Op){
        return Op.op(a, b);
    }
}
