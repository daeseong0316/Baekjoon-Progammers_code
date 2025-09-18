import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        long[] dp = new long[n+1];
        
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 1;
        if (n >= 3) dp[3] = 1;
        			
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-3];
		}
		bw.write(dp[n] + "\n");
	        
        
        bw.flush();
        br.close();
        bw.close();
    }
}
