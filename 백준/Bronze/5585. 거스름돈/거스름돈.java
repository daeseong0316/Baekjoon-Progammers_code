// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1000 - n;
		
		int[] money = {500, 100, 50, 10, 5, 1};
		
		int count = 0, i = 0;
		while(num != 0) {
			if(num >=  money[i]) {
				num -= money[i];
				count++;
			}
			else if(num < money[i]) {
				i++;
			}
		}
		
		System.out.println(count);
   	}
}