package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    //Program to find negative/positive number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }
}
