// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Long> list = new ArrayList<>();
        list.add(0L);
        list.add(1L);
        if(n==0) {
        	System.out.println(list.get(0));
        }
        else if(n==1) {
        	System.out.println(list.get(1));
        }
        else {
	        for(int i=2;i<=n;i++) {
	        	list.add(list.get(i-1) + list.get(i-2));
	        }
	        System.out.println(list.get(n));
        }
    }
}