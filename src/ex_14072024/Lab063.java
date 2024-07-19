package ex_14072024;

public class Lab063 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // 10 + 12
        System.out.println(a); //12
        // A - a++  -> Exp = 10 | a = 11
        // + - operator
        // B- a++  -> Exp = 12 | a = 12
    }
}
