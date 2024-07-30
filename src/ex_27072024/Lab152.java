package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "TANYA";
        s1 = "Singh";

        StringBuffer stringBuffer = new StringBuffer("Tanya");
        // change the value of string - Buffer
        System.out.println(stringBuffer.append("Singh")); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
