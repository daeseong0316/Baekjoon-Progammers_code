// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        final int car = 3;
        int[] arr = new int[101];
        
        for(int i=0;i<car;i++) {
        	int start = sc.nextInt();
        	int finish = sc.nextInt();
        	
        	for(int j=start;j<finish;j++) {
        		arr[j]++;
        	}
        }
        int result = 0;
        
        for(int i=0;i<=100;i++) {
        	if(arr[i] == 1) {
        		result += a;
        	}
        	else if(arr[i] == 2) {
        		result += 2 * b;
        	}
        	else if(arr[i] == 3) {
        		result += 3 * c;
        	}
        }
        
        System.out.println(result);
    }
}