// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n];
        Vector<Integer> vec = new Vector<>();
        
        for(int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        	for(int j=0;j<arr[i];j++) {
        		vec.add(i + 1);
        	}
        }
        for(int i=0;i<q;i++) {
        	int question = sc.nextInt();
        	System.out.println(vec.get(question));
        	
        }
    }
}