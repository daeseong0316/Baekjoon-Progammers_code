// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			
			String[] school = new String[num];
			int[] l = new int[num];
			int max = -1, index = 0;
			for(int j=0;j<num;j++) {
				school[j] = sc.next();
				l[j] = sc.nextInt();
				
				if(max < l[j]) {
					max = l[j];
					index = j;
				}
				
			}
			System.out.println(school[index]);
		}
   	}
}