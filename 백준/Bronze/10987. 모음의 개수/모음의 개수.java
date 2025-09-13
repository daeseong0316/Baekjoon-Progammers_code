import java.io. *;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
    	int len = str.length();
    	
    	int count = 0;
    	for(int i=0;i<len;i++) {
    		if(str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || 
    				str.charAt(i) == 'u' || str.charAt(i) == 'e') {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    	
    	sc.close();
    	}
}