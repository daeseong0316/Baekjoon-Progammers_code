import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder(str);
        while(sb.length() > 0) {
        	if(sb.length() >= 10) {
        		for(int i=0;i<10;i++) {
        			bw.write(sb.charAt(0));
        			sb.deleteCharAt(0);
        		}
        	}
        	else if(sb.length() < 10){
        		bw.write(sb.toString());
        		sb.setLength(0);
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}
