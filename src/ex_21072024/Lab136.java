package ex_21072024;

public class Lab136 {
    //  1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type
    public static void main(String[] args) {
        funcone();
        int add = functwo();
        System.out.println("Output of function 2"+ add);
        functhree(3 ,4);
        int diff = funcfour(10,4);
        System.out.println("Output of function 4"+ diff);
    }
    static void funcone() {
        System.out.println("Hello I am Without Parameters and Without Return Type");
    }
    static int functwo(){
        return (1+1);
    }
    static void functhree(int a , int b) {
        int sum = a+b;
        System.out.println("The sum of a + b" + sum);
    }
    static int funcfour(int x , int y) {
        return (x-y);
    }
}
