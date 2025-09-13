import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int a, b, n, result = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        
        for(int i=0;i<n+1;i++) {
        	result = a / b;
        	a = a % b * 10;
        }
        
        System.out.println(result);
        
		sc.close();
	}

}
