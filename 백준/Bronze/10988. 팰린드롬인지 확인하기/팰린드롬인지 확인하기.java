import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        String name = sc.next();
        int len = name.length();
        
        int result = 1;
        for(int i=0;i<len / 2;i++) {
        	if(name.charAt(i) != name.charAt(len - i - 1)) {
        		result = 0;
        	}
        }
        
        System.out.println(result);
        
		sc.close();
	}

}