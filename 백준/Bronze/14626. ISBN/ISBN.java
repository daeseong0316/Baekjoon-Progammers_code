import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int index = 0;
        int m = str.charAt(12) - '0';	// 7
        List<Character> list = new ArrayList<>();
        for(int i=0;i<12;i++) {
        	char c = str.charAt(i);
        	
        	if(c == '*') {
        		index = i;	// 10
        	}
        	list.add(c);
        }
        
        for(int x=0;x<=9;x++) {
        	int sum = 0;
            for(int i = 0; i < 12; i++) {
	            int temp;
	            if(i == index) {
	            	temp = x;
	            }
	            else {
	            	temp = list.get(i) - '0';
	            }
	            
	            if(i%2 == 0) {
	            	sum += temp;
	            }
	            else if(i%2 == 1) {
	            	sum += temp * 3;
	            }
            }
            
            int check = (10 - (sum % 10)) % 10;
            if(check == m) {
            	System.out.println(x);
            	return;
            }

        }
    }
}
