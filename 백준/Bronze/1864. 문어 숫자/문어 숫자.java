// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("-", 0);
		map.put("\\", 1);
		map.put("(", 2);
		map.put("@", 3);
		map.put("?", 4);
		map.put(">", 5);
		map.put("&", 6);
		map.put("%", 7);
		map.put("/", -1);
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("#")) break;
			String[] arr = str.split("");
			
			int sum = 0;
			int num = 0;
			for(int i=0;i<str.length();i++) {
				sum += map.get(arr[i]) * Math.pow(8, arr.length - 1 - i);
			}
			System.out.println(sum);
		}
	}
}