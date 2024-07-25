package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
//        Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you score :");
        float marks = sc.nextFloat();
        if (marks > 89 && marks <= 100) {
            System.out.println("Your grade is A");
        } else if (marks > 79 && marks <=89) {
            System.out.println("Your grade is B");
        } else if (marks > 69 && marks <=79) {
            System.out.println("Your grade is C");
        } else if (marks > 59 && marks <=69) {
            System.out.println("Your grade is D");
        } else if(marks >= 0 && marks <=59) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid Score");
        }
    }
}
