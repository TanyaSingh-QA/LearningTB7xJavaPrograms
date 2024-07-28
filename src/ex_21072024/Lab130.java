package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact = fact * n ;
            n--;
        }
        System.out.println("Factorial of is :"+fact);
    }
}
