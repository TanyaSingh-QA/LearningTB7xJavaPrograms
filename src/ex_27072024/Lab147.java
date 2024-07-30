package ex_27072024;

public class Lab147 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10,4, 13, 25, 18, 9, 8, 17,30};
        int max = salaries[0];
        int min = salaries[0];
        int max1 = salaries[0];
        for (int i = 0 ; i < salaries.length ; i++) {
            if(salaries[i] > max) {
                max = salaries[i];
            }
            if(salaries[i] < min) {
                min = salaries[i];
            }
        }
        System.out.println("Maximum salary is "+ max);
        System.out.println("Minimum salary is "+ min);
    }
}
