import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		
		int count1 = 0, count0 = 0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			
			if(a == 0) {
				count0++;
			}
			else if(a == 1) {
				count1++;
			}
		}
		
		if(count1 > count0) {
			System.out.println("Junhee is cute!");	
		}
		else {
			System.out.println("Junhee is not cute!");
		}
		
		sc.close();
	}
}

