// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();	// 2
        int c = sc.nextInt();	// 20
        
        int[] time = new int[n];
        int[] time2 = new int[n];
        for(int i=0;i<n;i++) {
        	time[i] = sc.nextInt();	// 4,6
        	time2[i] = time[i];
        }
        
        int count = 0;
        for(int i=0;i<=c;i++) {
        	boolean temp = false;
        	for(int j=0;j<n;j++) {
        		if(i == time[j]) {
        			temp = true;
        			time[j] += time2[j];
        		}
        	}
        	if(temp) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}