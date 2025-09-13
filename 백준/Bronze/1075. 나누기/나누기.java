// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int f = sc.nextInt();
        
        int temp = n % 100;
        int num = n - temp;
        
        int count = 0;
        int i = 1;
        if(num % f != 0) {
        	while(true) {
        		num += i;
        		count++;
        		if(num % f == 0) {
        			break;
        		}
        	}
        } 
        if(count < 10) {
        	String strTemp = String.valueOf(count);
        	System.out.println("0" + strTemp);
        }
        else {
        	System.out.println(count);
        }
    }
}