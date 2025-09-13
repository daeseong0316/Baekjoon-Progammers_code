//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void print(List<Integer> list) {
		for(int i=0;i<5;i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		final int t = 5;
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		for(int i=0;i<t;i++) {
			list.add(sc.nextInt());			
		}
		
		while(!list.equals(list2)) {
			for(int i=0;i<t-1;i++) {
				if(list.get(i) > list.get(i+1)) {
					Collections.swap(list, i, i+1);
					print(list);
				}
			}
		}
	}
}