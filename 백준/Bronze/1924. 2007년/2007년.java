// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	// 월
		int y = sc.nextInt();	// 일
		
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totaldays = 0;
		for(int i=0;i<x-1;i++) {
			totaldays += monthdays[i];
		}
		totaldays += y;
		
		String result = days[totaldays % 7];
		System.out.println(result);
	}
}