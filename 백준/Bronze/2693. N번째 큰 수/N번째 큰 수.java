// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int[] arr = new int[10];
			for(int j=0;j<10;j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			int max = arr[7];
			System.out.println(max);
		}
		
	}
}