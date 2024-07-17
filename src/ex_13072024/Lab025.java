package ex_13072024;

public class Lab025 {
    public static void main(String[] args) {
        int a =10;
        int b =34;
        System.out.println(a+b);

        String s1 = "Tanya";
        String s2 = "Singh";
        System.out.println(s1+s2);

        String s3 = "Tanya";
        int x = 100;
        int y = 99;

        System.out.println(x+y+s3);//output -> 199Tanya
        System.out.println(s3+x+y);//output ->Tanya10099
        System.out.println(x+s3+y);//output ->100Tanya99
        System.out.println(x+y+s3+y+s3+x+y);//output ->199Tanya99Tanya10099
    }
}
