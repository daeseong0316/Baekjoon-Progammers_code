import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        
        // 파스칼 삼각형 DP (최대 30줄까지 가능하므로 충분히 크게)
        int[][] dp = new int[31][31];
        
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        
        int result = 0;
        for (int i = r; i < r + w; i++) { // r행부터 r+w-1행까지
            for (int j = c; j <= c + (i - r); j++) { // c열부터 점점 증가
                result += dp[i][j];
            }
        }
        
        System.out.println(result);
    }
}
