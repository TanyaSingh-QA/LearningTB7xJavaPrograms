package ex_28072024;

public class Animal {

    String name = "animal";
    String color ;

    void talk(){}
    void walk(){}

    public static void main(String[] args) {
        Animal aniRef = null;
        Animal aniRef1 = new Animal();
        Animal aniRef2 = new Animal();
        Animal aniRef3 = aniRef2;
        System.out.println(aniRef2.name);
        System.out.println(aniRef3.name);

    }
}
