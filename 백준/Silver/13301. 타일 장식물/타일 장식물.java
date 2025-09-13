import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n번째 정사각형 
        
        long[] dp = new long[n+1];
        
        if(n == 1) {
        	bw.write("4");
        }
        else {
	        // 초기식
	        dp[0] = 1;
	        dp[1] = 1;
	        //dp[2] = 2;
	        
	        // 점화식
	        for(int i=2;i<=n;i++) {
	        	dp[i] = dp[i-2] + dp[i-1];
	        }
	        
	        bw.write(dp[n-1]*4 + dp[n-2]*2 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
