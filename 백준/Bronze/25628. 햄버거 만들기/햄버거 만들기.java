import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int p = sc.nextInt();
        
        int ham = 0;
        while(true) {
        	if(b < 2 || p < 1) {
        		break;
        	}
        	b -= 2;
        	p -= 1;
        	ham++;
        }
        
        System.out.println(ham);
        
        sc.close();
    }
}
