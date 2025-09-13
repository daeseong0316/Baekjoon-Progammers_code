import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int countD = 0, countP = 0;
        for(int i=0;i<n;i++) {
        	char ch = sc.next().charAt(0);
        	
        	if(ch == 'D') {
        		countD++;
        	}
        	else if(ch == 'P') {
        		countP++;
        	}
        	
        	if(countD + 2 == countP || countD == countP + 2) {
        		break;
        	}
        }
        System.out.println(countD + ":" + countP);
        
        
        sc.close();
    }
}