import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        char[] Carr = str.toCharArray();
        
        int count0 = 0, count1 = 0;
        
        if(Carr[0] == '0') {
        	count0++;
        }
        else {
        	count1++;
        }
        
        for(int i=1;i<Carr.length;i++) {
        	if(Carr[i] != Carr[i-1]) {
        		if(Carr[i] == '0') {
        			count0++;
        		}
        		else {
        			count1++;
        		}
        	}
        }
        
        int result = Math.min(count0, count1);
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
