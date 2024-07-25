package ex_20072024;

import java.util.Scanner;

public class Lab086 {
    //Program to print number is even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
