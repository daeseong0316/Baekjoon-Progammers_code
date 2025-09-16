import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 숫자의 개수
        
        double[] dp = new double[n];
        for(int i=0;i<n;i++) {
        	dp[i] = Double.parseDouble(br.readLine());
    	}
        
        double max = dp[0];
        for(int i=0;i<n;i++) {
        	double temp = 1;
        	for(int j=i;j<n;j++) {
        		temp *= dp[j];
        		max = Math.max(max, temp);
        	}
        }
        
        System.out.printf("%.3f\n", max);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
