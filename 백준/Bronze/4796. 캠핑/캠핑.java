// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int number = 0;
        while(true) {
	        int l = sc.nextInt();
	        int p = sc.nextInt();
	        int v = sc.nextInt();
	        
	        if((l == 0) && (p == 0) && (v == 0)) {
	        	break;
	        }
	        
	        int n = v / p;
	        int n1 = v % p;
	        
	        int result = (n*l) + Math.min(n1, l);
	        
	        number++;
	        System.out.println("Case " + number +": " + result);
        }
    }
}