import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());	// 비용
        int y = Integer.parseInt(st.nextToken());	// 투자 기간
        
        int[] dp = new int[y+1];
        
        // 초기식
        dp[0] = h;
        
        // 점화식
        for(int i=0;i<y;i++) {
        	if(i+1 <= y) {	// 1년 투자
        		dp[i + 1] = Math.max(dp[i + 1], (int)(dp[i] * 1.05));
        	}
        	if(i+3 <= y) {	// 3년 투자
        		dp[i + 3] = Math.max(dp[i + 3], (int)(dp[i] * 1.20));
        	}
        	if(i+5 <= y) {	// 5년 투자
        		dp[i + 5] = Math.max(dp[i + 5], (int)(dp[i] * 1.35));
        	}
        }
        
        bw.write(dp[y] + "\n");	// 출력
        
        bw.flush();
        br.close();
        bw.close();
    }
}
