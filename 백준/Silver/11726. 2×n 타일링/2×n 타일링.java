import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int[] dp = new int[1001];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3;i<=1000;i++) {
        	dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        int n = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(dp[n]));
        
        bw.flush();
        bw.close();
    }
}
