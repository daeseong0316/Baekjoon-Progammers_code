import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++) {
        	String pw = br.readLine();
        	
        	int len = pw.length();
        	if(len >= 6 && len <= 9) {
        		bw.write("yes\n");
        	}
        	else {
        		bw.write("no\n");
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
