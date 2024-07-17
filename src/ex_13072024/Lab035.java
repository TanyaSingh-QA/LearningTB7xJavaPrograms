package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        // Escape Chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word
        System.out.println("Tanya" + c3 + "Singh");
        System.out.println("Tanya" + c2 + "Singh");
        System.out.println("Tanya" + c1 + "Singh");
        System.out.println("Tanya" + c + "Singh");

    }
}
