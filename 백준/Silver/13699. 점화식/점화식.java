import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        long[] dp = new long[n+1];
        
        dp[0] = 1;
        
        for(int i=1;i<=n;i++) {
        	dp[i] = 0;
        	for(int j=0;j<i;j++) {
        		dp[i] += dp[j]*dp[i-j-1];
        	}
        }
        
        bw.write(dp[n] + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
