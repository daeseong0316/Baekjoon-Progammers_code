import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while ((str = br.readLine()) != null) {
        	int count1 = 0;
        	int count2 = 0;
        	int count3 = 0;
        	int count4 = 0;
        	
        	for(int j=0;j<str.length();j++) {
        		char c = str.charAt(j);
        		
        		if(c >= 'a' && c <= 'z') {
        			count1++;
        		}
        		else if(c >= 'A' && c <= 'Z') {
        			count2++;
        		}
        		else if(c >= '0' && c <= '9') {
        			count3++;
        		}
        		else if(c == ' ') {
        			count4++;
        		}
        	}
        	bw.write(count1 + " " + count2 + " " + count3 + " " + count4 + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
