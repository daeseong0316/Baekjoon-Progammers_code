import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	
        	long result = 1;
        	int r = 1;
        	
        	for(int j=m;j>m-n;j--) {
        		result *= j;
        		result /= r++;
        	}
        	System.out.println(result);
        }
        
		sc.close();
	}

}
