package HomeWork_20072024;

import java.util.Scanner;

public class Triangleclassifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of side a of a Triangle");
        int a = s.nextInt();
        System.out.println("Enter the length of side b of a Triangle");
        int b = s.nextInt();
        System.out.println("Enter the length of side c of a Triangle");
        int c = s.nextInt();

        //Comparing the sides
        if (a == b && b == c) {
            System.out.println("The Triangle is equivalent Triangle");
        }
        else if (( a == b ) || (b == c) || (c == a)){
            System.out.println("The Triangle is isosceles Triangle");
            }
            else {
                System.out.println("The Triangle is scalene");
                }

    }
}
