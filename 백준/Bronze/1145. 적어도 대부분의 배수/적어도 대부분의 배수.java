// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = 5;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int j = 1;
		while(true) {
			int count = 0;
			for(int i=0;i<n;i++) {
				if(j % arr[i] == 0) {
					count++;
				}
			}
			if(count >= 3) {
				break;
			}
			j++;
		}
		System.out.println(j);
   	}
}