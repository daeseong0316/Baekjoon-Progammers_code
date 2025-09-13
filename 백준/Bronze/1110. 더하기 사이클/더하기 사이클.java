// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		if(n.length() < 2) {
			n = "0" + n;
		}
		String a = n;
		
		int count = 0;
		while(true) {
			char n10 = a.charAt(0);
			char n1 = a.charAt(1);
			
			int intN10 = Integer.parseInt(n10+"");
			int intN1 = Integer.parseInt(n1+"");
			
			int temp = intN10 + intN1;
			String Strtemp = String.valueOf(temp);
			char Strtemp1 = '0';
			if(Strtemp.length() == 1) {
				Strtemp1 = Strtemp.charAt(0); 
			}
			else if(Strtemp.length() == 2) {
				Strtemp1 = Strtemp.charAt(1);
			}
			
			a = ""+n1 + Strtemp1;
			count++;
			if(a.equals(n)) {
				break;
			}
		}
		System.out.println(count);
	}
}