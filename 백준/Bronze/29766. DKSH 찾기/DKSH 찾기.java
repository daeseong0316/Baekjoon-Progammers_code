import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String name = "DKSH";
        
        int count = 0;
        int index = 0;
        while((index = str.indexOf(name, index)) != -1) {
        	count++;
        	index += name.length();
        }
        
        System.out.println(count);
        
        sc.close();
    }
}
