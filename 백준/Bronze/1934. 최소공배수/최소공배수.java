// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			int a = x, b = y;
			while(b != 0) {
				int temp = a % b;
				a = b;
				b = temp;		
			}
			
			int result = (x*y) / a; 
			
			System.out.println(result);
		}
	}
}