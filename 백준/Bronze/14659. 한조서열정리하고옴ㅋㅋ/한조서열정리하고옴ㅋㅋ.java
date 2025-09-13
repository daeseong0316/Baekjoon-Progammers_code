//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int n = sc.nextInt();

		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = sc.nextInt();
		}
		
		List<Integer> max = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=i+1;j<n;j++) {
				if(h[i] > h[j]) {
					count++;
				}
				else {
					break;
				}
			}
			max.add(count);			
		}
		
		int maxx = max.get(0);
		for(int j=0;j<max.size();j++) {
			if(maxx < max.get(j)) {
				maxx = max.get(j);
			}
		}
		System.out.println(maxx);
	}
}