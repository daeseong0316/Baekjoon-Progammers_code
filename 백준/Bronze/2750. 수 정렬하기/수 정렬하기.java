import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int num: arr) {
			System.out.println(num);
		}
		
		sc.close();
	}
}
