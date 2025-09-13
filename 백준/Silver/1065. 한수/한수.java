import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        if(n < 100) {
        	count = n;
        }
        else {
        	count = 99;						
	        for(int i=100;i<=n;i++) {
	        	String s = String.valueOf(i);
	        	int a = s.charAt(0) - '0';
	               int b = s.charAt(1) - '0';
	               int c = s.charAt(2) - '0';
	               
	               if ((a - b) == (b - c)) {
	                   count++;
	               }
	        }
        }
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
    }
}
