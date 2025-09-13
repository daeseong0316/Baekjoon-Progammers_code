// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)  throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");
        	
        	for(int j=0;j<str.length;j++) {
        		for(int k=str[j].length()-1;k>=0;k--) {
        			bw.write(str[j].charAt(k));
        		}
        		bw.write(" ");
        	}
        	bw.write("\n");
        }
        
        bw.flush(); 
        bw.close(); 
   	}
}