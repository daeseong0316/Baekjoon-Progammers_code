import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] dp = new int[n+1];
        
        dp[1] = 0;
        
        for(int i=2;i<=n;i++) {
			dp[i] = dp[i - 1] + 1; // 1을 빼는 연산
			
			if (i % 2 == 0) {
			    dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누는 연산
			}
			if (i % 3 == 0) {
			    dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누는 연산
			}
        }
        
        bw.write(String.valueOf(dp[n]));
         
        bw.flush();
        bw.close();
    }
}
