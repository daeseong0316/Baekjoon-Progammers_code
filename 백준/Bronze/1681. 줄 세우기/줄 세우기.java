// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();	
        
        String[] arr = new String[n];	
        int num = 1, index = 0;
        while(true) {
        	String strNum = String.valueOf(num);
        	String strL = String.valueOf(l);
        	
        	if(index == n) {
        		break;
        	}
        	
        	if(strNum.contains(strL)) {
        		num++;
        		continue;
        	}
        	else { 
	    		arr[index] = strNum;
	    		index++;
	    		num++;
        	}
        }
        System.out.println(arr[n-1]);
    }
}