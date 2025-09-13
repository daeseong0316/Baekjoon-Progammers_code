import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int result = 10;
        for(int i=0;i<str.length()-1;i++) {
    		char c = str.charAt(i);
    		char cc = str.charAt(i+1);
    		
    		if(c == cc) {
    			result += 5;
    		}
    		else {
    			result += 10;
    		}
        }
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
