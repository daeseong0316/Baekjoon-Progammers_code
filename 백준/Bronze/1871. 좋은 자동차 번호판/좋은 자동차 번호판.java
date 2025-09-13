// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	String[] str = sc.next().split("-");
        	String alpa = str[0];
        	int num = Integer.parseInt(str[1]);
        	
        	char[] ch = new char[3];
        	int[] value = new int[3];
        	int FirValue = 0;
        	int op = 2;
        	for(int j=0;j<3;j++) {
        		ch[j] = alpa.charAt(j);
        		value[j] = ch[j]-'A';
        		FirValue += value[j] * (Math.pow(26, op));
        		op--;
        	}
        	
        	int result = Math.abs(FirValue-num);
        	
        	if(result <= 100) {
        		System.out.println("nice");
        	}
        	else {
        		System.out.println("not nice");
        	}
        }
    }
}