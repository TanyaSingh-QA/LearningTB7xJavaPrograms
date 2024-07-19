package ex_14072024;

public class Lab080 {
    public static void main(String[] args) {
        //Program to find b/w 2 nos. using ternary operators
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        System.out.printf("The Maximum number is -> %d\n",max);
        System.out.printf("The Minimum number is -> %d",min);
    }
}
