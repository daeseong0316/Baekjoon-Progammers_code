// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	String num = sc.next();
        	Set<Character> h = new HashSet<>();
        	
        	for(int j=0;j<num.length();j++) {
        		h.add(num.charAt(j));
        	}
        	System.out.println(h.size());
        }
    }
}