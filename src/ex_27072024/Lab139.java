package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        String weekdays[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for ( int i = 0 ; i < weekdays.length ; i++){
            System.out.println(weekdays[i]);
        }
    }
}
