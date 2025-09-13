import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
        
        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static void dfs(int n, int m, int depth) {
    	if(depth == m) {
    		for(int val: arr) {
    			sb.append(val).append(" ");
    		}
    		sb.append("\n");
    		return;
    	}
    	for(int i=0;i<n;i++) {
    		if(!visit[i]) {
    			visit[i] = true;
    			arr[depth] = i+1;
    			dfs(n, m, depth+1);
    			
    			visit[i] = false;
    		}
    	}
    }
}
