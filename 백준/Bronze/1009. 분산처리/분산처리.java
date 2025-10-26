import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	int result = 1;
        	for(int j=0;j<b;j++) {
        		result = (result*a) % 10;
        	}
        	
        	if(result == 0) {
        	    bw.write("10\n");
        	} else {
        	    bw.write(result + "\n");
        	}

        }
        
        bw.flush();
        bw.close();
    }
}
