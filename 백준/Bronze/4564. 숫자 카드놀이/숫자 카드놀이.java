import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();

            if(str.equals("0")) break;

            System.out.print(str + " ");

            while(str.length() > 1) {
                int mul = 1;
                for(int i = 0; i < str.length(); i++) {
                    int digit = Character.getNumericValue(str.charAt(i));
                    mul *= digit;
                }
                str = String.valueOf(mul);

                System.out.print(str + " ");
            }

            System.out.println();
        }
        
        sc.close();
    }
}
