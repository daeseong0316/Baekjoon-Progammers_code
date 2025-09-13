//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int n = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			int pos = sc.nextInt();
			
			if(map.containsKey(num)) {
				if(map.get(num) != pos) {
					count++;
					map.put(num, pos);
				}
			}
			else {
				map.put(num, pos);
			}
		}
		System.out.println(count);
	}
}