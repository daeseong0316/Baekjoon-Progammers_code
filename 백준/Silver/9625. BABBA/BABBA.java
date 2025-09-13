import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[k+1][2];
        
        dp[0][0] = 0;
        dp[0][1] = 1;
        
        for(int i=1;i<=k;i++) {
        	dp[i][0] = dp[i-1][0] + dp[i-1][1];
        	dp[i][1] = dp[i-1][0];
        }
         
        bw.write(dp[k][1] + " " + dp[k][0]);
        
        br.close();
        bw.flush();
        bw.close();
    }
}
