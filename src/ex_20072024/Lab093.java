package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String name = sc.next().toLowerCase();
        switch (name) {
            case "chrome" :
                System.out.println("Starting chrome browser");
                break;
            case "firefox" :
                System.out.println("starting Firefox browser");
                break;
            case "edge" :
                System.out.println("Starting Edge browser");
                break;
            case "safari" :
                System.out.println("Starting Safari browser");
                break;
            default:
                System.out.println("Don't know which browser it is !!");
        }
    }
}
