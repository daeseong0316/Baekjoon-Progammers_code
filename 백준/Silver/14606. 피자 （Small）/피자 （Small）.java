import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n개의 피자판
        
        int[] dp = new int[n+1];
        
        // 초기식
        dp[0] = 0;
        dp[1] = 0;
        
        // 점화식
        for(int i=2;i<=n;i++) {
        	dp[i] = i*(i-1)/2;
        }
        
        bw.write(dp[n] + "\n");	// 출력

        bw.flush();
        br.close();
        bw.close();
    }
}
