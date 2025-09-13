// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] color = {"black", "brown", "red", "orange", "yellow",
        					"green", "blue", "violet", "grey", "white" };
        String[] value = {"0","1","2","3","4","5","6","7","8","9"};
        long[] mul = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        
        String[] temp = new String[2];
        for(int i=0;i<2;i++) {
        	String str = sc.next();
        	for(int j=0;j<color.length;j++) {
	        	if(color[j].equals(str)) {
	        		temp[i] = value[j];
	        		break;
	        	}
        	}
        }
        long num1 = 0;
        String str1 = sc.next();
        for(int i=0;i<color.length;i++) {
        	if(color[i].equals(str1)) {
        		num1 = mul[i];
        	}
        }
        String imsi = temp[0] + temp[1];
        long num = Long.parseLong(imsi);
        
        long result = num * num1;
        
        System.out.println(result);
    }
}