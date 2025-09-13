import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 숫자 n개
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// n개의 수
        }
        int[] dp = new int[n];

        // LIS는 최소 길이가 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;	// dp 배열을 1로 초기화
        }

        int maxLen = 1;	// 길이
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {	// 큰 수만
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        bw.write(String.valueOf(maxLen));	// 출력
        
        bw.flush();
        bw.close();
    }
}
