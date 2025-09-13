// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        for(int i=0;i<c;i++) {
        	int n = sc.nextInt();
        	
        	int sum = 0, ave = 0;
        	float p = 0;
        	int count = 0;
        	int[] score = new int[n];
        	for(int j=0;j<n;j++) {
        		score[j] = sc.nextInt();
        		
        		sum += score[j];
        	}
        	ave = sum / n;
        	p = (float)100 / n;
        	
        	for(int k=0;k<n;k++) {        		
        		if(score[k] > ave) {
        			count++;
        		}
        	}
        		
        	float result = p * count;
        	System.out.printf("%.3f%%\n", result);
        }
    }
}