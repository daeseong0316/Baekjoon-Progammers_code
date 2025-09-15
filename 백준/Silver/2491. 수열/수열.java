import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 숫자의 개수
        
        int dp[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	dp[i] = Integer.parseInt(st.nextToken());	// 
        }
        
        int max = 1;	// 가장 긴 수열의 길이
        int upcount = 1;	// 증가하는 수열
        int downcount = 1;	// 감소하는 수열
        for(int i=1;i<n;i++) {
        	if(dp[i] >= dp[i-1]) {	// 증가하는 수열
        		upcount++;
        	}
        	else {
        		upcount = 1;	// 구간이 바뀔시
        	}
        	
        	if(dp[i] <= dp[i-1]) {	// 감소하는 수열
        		downcount++;
        	}
        	else {
        		downcount = 1;	// 구간이 바뀔시
        	}
        	max = Math.max(max, Math.max(upcount, downcount));	// 가장 긴 수열의 크기 구하기
        }
        
        bw.write(max + "\n");	// 출력
        
        bw.flush();
        br.close();
        bw.close();
    }
}
