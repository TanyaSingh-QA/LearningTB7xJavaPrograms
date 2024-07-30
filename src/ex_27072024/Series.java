package ex_27072024;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum = 0 ;
        int S1 = 0;
        int S2 = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0 ; j < n ; j++){
                if (j == 0 ) {
                    S1 = a + (int) Math.pow(2, j) * b;
                }else {
                    S2 = (int) Math.pow(2, j) * b;
                }
                sum = sum + S2;
                System.out.print(sum+S1+" ");
            }
            System.out.print("\n");
            sum = 0 ;
            S1 = 0;
            S2 = 0;
        }
        in.close();
    }
}