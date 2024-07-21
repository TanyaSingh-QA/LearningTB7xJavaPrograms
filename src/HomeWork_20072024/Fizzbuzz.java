package HomeWork_20072024;

public class Fizzbuzz {
    public static void main(String[] args) {
        //Using For Loop
        for (int num =1 ; num <=100 ; num++){
            if ((num % 3 == 0) && (num % 5 ==0)){
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
