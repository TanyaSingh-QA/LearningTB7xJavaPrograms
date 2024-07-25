package ex_20072024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        //Conditional statement if else
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age to decide eligibility");
        byte age = s.nextByte();
        if(age >= 18){
            System.out.println("Eligible to give vote");
        }else {
            System.out.println("Sorry !! Not eligible");
        }
    }
}
