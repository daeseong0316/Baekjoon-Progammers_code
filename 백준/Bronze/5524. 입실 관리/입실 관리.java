import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	String name = sc.next();
        	
        	String change_name = name.toLowerCase();
        	
        	System.out.println(change_name);
        }
        
        sc.close();
    }
}
