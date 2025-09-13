import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        StringBuilder st = new StringBuilder();
        for(int i=0;i<str.length();i++) {
        	char c = str.charAt(i);
        	if (c >= 'a' && c <= 'z') {
        	    st.append((char)('a' + (c - 'a' + 13) % 26));
        	} else if (c >= 'A' && c <= 'Z') {
        		st.append((char)('A' + (c - 'A' + 13) % 26));
        	} else {
        		st.append(c);
        	}
        	
        }
        
        bw.write(st.toString());
        
        bw.flush();
        bw.close();
    }
}
