// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0;i<a.length;i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		
		int result = min * max;
		
		System.out.println(result);
	}
}