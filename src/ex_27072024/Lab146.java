package ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        float[] marks = new float[5];
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0 ; i < marks.length ; i++) {
            System.out.println("Enter the marks of "+(i+1)+" subject");
            marks[i] = sc.nextFloat();
        }
        for(int j = 0 ; j < marks.length ; j++){
            sum = sum + marks[j];
        }
        System.out.println("Average of 5 Subjects"+(sum/5));

    }
}
