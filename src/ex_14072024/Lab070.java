package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Tanya");
        String s2 = new String("Tanya");
        //  2, Heap area
        String s3  = s1;
        //  2, heap  s3 -> s1 -> Pramod
        System.out.println(s3 == s1);
    }
}
