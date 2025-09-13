//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int n = sc.nextInt();
		String s = sc.next();
					
		int cupholder = 1, i = 0;
		while(i < s.length()) {
			if(s.charAt(i) == 'S') {
				cupholder++;
				i++;
			}
			else if(s.charAt(i) == 'L') {
				cupholder++;
				i += 2;
			}
		}
		
		System.out.println(Math.min(cupholder, n));
    }
}