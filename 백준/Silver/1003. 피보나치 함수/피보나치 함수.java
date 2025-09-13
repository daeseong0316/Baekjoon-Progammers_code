import java.io.*;
import java.util.*;

public class Main {
	static int[] count0 = new int[41];
	static int[] count1 = new int[41];
	static boolean[] visited = new boolean[41];
	
	public static void fibonacci(int n) {
	    if (n == 0) {
	    	count0[0] = 1;
	    	count1[0] = 0;
	    	visited[0] = true;
	        return;
	    } 
	    if (n == 1) {
	    	count0[1] = 0;
	    	count1[1] = 1;
	    	visited[1] = true;
	        return;
	    }
	    if(!visited[n]) {
	    	fibonacci(n - 1);
            fibonacci(n - 2);
            count0[n] = count0[n - 1] + count0[n - 2];
            count1[n] = count1[n - 1] + count1[n - 2];
            visited[n] = true;
	    }
	}
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());
        	
    		fibonacci(num);
        	
    		bw.write(count0[num] + " " + count1[num] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
