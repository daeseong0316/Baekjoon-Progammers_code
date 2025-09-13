import java.io. *;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	int s = sc.nextInt();
    	
    	if(t <= 11 || s == 1 || t > 16) {
    		System.out.println(280);
    	}
    	else if(t >= 12 && t<= 16 && s == 0) {
    		System.out.println(320);
    	}
    	
    	sc.close();
    	}
}
