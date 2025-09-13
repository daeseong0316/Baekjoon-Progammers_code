import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        boolean[] removed = new boolean[n+1];
        int count = 0;
        
        for(int p=2;p<=n;p++) {
        	if(!removed[p]) {
        		for(int multiple=p;multiple<=n;multiple+=p) {
        			if(!removed[multiple]) {
        				removed[multiple] = true;
        				count++;
        				
        				if(count == k) {
        					bw.write(String.valueOf(multiple));
        					bw.flush();
        			        bw.close();
        			        return;
        				}
        			}
        		}
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
