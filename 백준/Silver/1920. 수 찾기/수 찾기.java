import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
        	int num = sc.nextInt();
        	map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        int m = sc.nextInt();
        for(int i=0;i<m;i++) {
        	int value = sc.nextInt();
        	
        	if(map.containsKey(value)) {
        		System.out.println("1");
        	}
        	else {
        		System.out.println("0");
        	}
        }
    }
}
