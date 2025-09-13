import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gan[] = {1, 2, 3, 3, 4, 10};
        int sa[] = {1, 2, 2, 2, 3, 5, 10};
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	int Gan = 0;
        	int Sa = 0;

        	for(int j=0;j<gan.length;j++) {
        		int GanNum = sc.nextInt();
        		Gan += GanNum * gan[j];
        	}
        	for(int j=0;j<sa.length;j++) {
        		int SaNum = sc.nextInt();
        		Sa += SaNum * sa[j];
        	}
        	
        	System.out.print("Battle " + (i+1) + ": ");
        	
        	if(Gan > Sa) {
        		System.out.println("Good triumphs over Evil");
        	}
        	else if(Gan < Sa) {
        		System.out.println("Evil eradicates all trace of Good");
        	}
        	else {
        		System.out.println("No victor on this battle field");
        	}
        	
        }
        
        sc.close();
    }
}
