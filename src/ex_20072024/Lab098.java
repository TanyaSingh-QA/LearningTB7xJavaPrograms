package ex_20072024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll dice between 1-6");
        byte num = sc.nextByte();
        switch (num) {
            case 1,3,5 -> System.out.println("The number is odd");
            case 2,4,6 -> System.out.println("The number is even");
            default -> System.out.println("Not a valid number");
        }
    }
}
