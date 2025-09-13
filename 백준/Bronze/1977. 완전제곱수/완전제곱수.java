// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        Vector<Integer> vec = new Vector<>();
        for(int i=1;i*i<=n;i++) {
        	int pow = i*i;
        	if(pow >= m) {
        		vec.add(pow);
        	}
        }
        if(vec.isEmpty()) {
        	System.out.println("-1");
        }
        else {
	        int sum = 0;
	        int min = vec.get(0);
	        for(int num: vec) {
	        	sum += num;
	        	if(num<min) min = num;
	        }
	        
	        System.out.println(sum);
	        System.out.println(min);
        }
    }
}