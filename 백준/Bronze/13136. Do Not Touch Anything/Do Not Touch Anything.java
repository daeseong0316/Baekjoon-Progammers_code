import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long r = sc.nextInt();	// 7
        long c = sc.nextInt();	// 9
        long n = sc.nextInt();	// 3
        
        long countR = 0, countC = 0;
        while(true) {
        	if(r < 1) {
        		break;
        	}
        	r -= n;
        	countR++;
        }
        while(true) {
        	if(c < 1) {
        		break;
        	}
        	c -= n;
        	countC++;
        }
        
        long result = countR*countC;
        
        System.out.println(result);
        
        sc.close();
    }
}
