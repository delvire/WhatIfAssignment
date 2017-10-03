import java.util.Scanner;
public class WhatIf {
    public static void main(String[] args)
    {
        int num1, num2, sum,product,average;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First Number?:");
        num1 = keyboard.nextInt();
        System.out.print("Last Number? :");
        num2 = keyboard.nextInt();

        sum=num1+num2;
        if (sum>200)
            System.out.print("*");
        if (sum<1000);
        System.out.print("~");

//        product=num1*num2;
//
//        average=((num1+num2)/2);

        if (num2>3000);
        System.out.print("Wow, You choose a big number[Value of number2] is number 2");

    }
}
