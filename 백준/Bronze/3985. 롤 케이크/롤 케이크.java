//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int L = sc.nextInt();	
		boolean[] L_arr = new boolean[L];
		
		int n = sc.nextInt();	
		
		int[] n_arr = new int[n];
		int[] c_arr = new int[n];
		int na = 0;
		for(int i=0;i<n;i++) {
			int p = sc.nextInt();
			int k = sc.nextInt();
			
			for(int j=p-1;j<k;j++) {		
				if(!L_arr[j]) {
					L_arr[j] = true;
					n_arr[na]++;
				}
			}
			c_arr[na] = k-p+1;
			na++;			
		}
		int n_max = n_arr[0], n_idx = 0;
		int c_max = c_arr[0], c_idx = 0;

		for (int i = 1; i < n; i++) {
		    if (n_arr[i] > n_max) {
		        n_max = n_arr[i];
		        n_idx = i;
		    }
		    if (c_arr[i] > c_max) {
		        c_max = c_arr[i];
		        c_idx = i;
		    }
		}
		System.out.println(c_idx + 1); 
		System.out.println(n_idx + 1); 

	}
}