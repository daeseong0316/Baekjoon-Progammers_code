// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;
        while(n > 0) {
        	n -= 5;
        	count++;
        }
        
        System.out.println(count);
    }
}