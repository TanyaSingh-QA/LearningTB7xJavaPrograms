package ex_28072024;

public class BuildingBP {

    String color;
    String name;
    String address;
    int noofrooms = 10;

    void useLift(){
        System.out.println("I am using Lift");
    }
    void activities(){
        System.out.println("I am using Activities");
    }

    public static void main(String[] args) {
        BuildingBP B = new BuildingBP();
        B.useLift();
        B.activities();
    }
}
