import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int n;
        n = sc.nextInt();
        
        int num = 666;
        String str = "";
        
        while(n > 0) {
        	str = Integer.toString(num);
        	if(str.indexOf("666") != -1) {
        		n--;
        	}
        	num++;
        }
        
        System.out.println(str);
        
		sc.close();
	}

}