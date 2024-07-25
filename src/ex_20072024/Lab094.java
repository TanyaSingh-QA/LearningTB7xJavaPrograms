package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character and will tell you either vowel or consonant");
        char letter = sc.next().toLowerCase().charAt(0);
        switch (letter) {
            case 'a' :
                System.out.println("Its a vowel");
                break;
            case 'e' :
                System.out.println("Its a vowel");
                break;
            case 'i' :
                System.out.println("Its a vowel");
                break;
            case 'o' :
                System.out.println("Its a vowel");
                break;
            case 'u' :
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its a consonant");
        }
    }
}
