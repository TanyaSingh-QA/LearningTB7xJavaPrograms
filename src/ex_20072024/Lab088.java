package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Program to find max of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("Maximum is - >"+num1);
        } else if(num2 > num1) {
            System.out.println("Maximum is ->"+num2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
