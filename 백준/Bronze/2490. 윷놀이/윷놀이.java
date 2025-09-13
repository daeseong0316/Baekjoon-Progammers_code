import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while((str = br.readLine()) != null) {	// 문자열 입력
        	String[] s = str.split(" ");
        	
        	int sum = 0;
        	for(int i=0;i<s.length;i++) {
        		sum += Integer.parseInt(s[i]);
        	}
        	
        	if(sum == 0) {
        		bw.write("D\n");
        	}
        	else if(sum == 3) {
        		bw.write("A\n");
        	}
        	else if(sum == 2) {
        		bw.write("B\n");
        	}
        	else if(sum == 1) {
        		bw.write("C\n");
        	}
        	else if(sum == 4) {
        		bw.write("E\n");
        	}
        	
        	bw.flush();
        }
        
        bw.close();
    }
}
