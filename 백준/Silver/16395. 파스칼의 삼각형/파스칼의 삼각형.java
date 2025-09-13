import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[][] dp = new int[31][31];
        
        for(int i = 0; i <= 30; i++) {
            for(int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1; // 양 끝은 항상 1
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j]; // 점화식
                }
            }
        }

        bw.write(dp[n-1][k-1] + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
