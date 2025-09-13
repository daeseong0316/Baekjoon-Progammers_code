import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();
        
        int day = 1;
        int result = 0;
        
        while(true) {
        	day += t;	
        	if(day > n ) {	   
        		break;
        	}
        	result += c * p;	
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
