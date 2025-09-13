import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	int level = sc.nextInt();
        	
        	if(level == 300) {
        		System.out.print("1 ");
        	}
        	else if(level <300 && level >= 275) {
        		System.out.print("2 ");
        	}
        	else if(level <275 && level >= 250) {
        		System.out.print("3 ");
        	}
        	else if(level < 250) {
        		System.out.print("4 ");
        	}
        }
        
        sc.close();
    }
}
