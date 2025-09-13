//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
						
			int a = n;
			int count = 0;
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=0;j<=m-n;j++) {
				list.add(a);
				
				ArrayList<Character> list2 = new ArrayList<>();
				String str = String.valueOf(a);
				for(int k=0;k<str.length();k++) {
					list2.add(str.charAt(k));
					
					if(str.charAt(k) == '0') {
						count++;
					}
				}
				a++;
			}	
			
			System.out.println(count);
		}
	}
}