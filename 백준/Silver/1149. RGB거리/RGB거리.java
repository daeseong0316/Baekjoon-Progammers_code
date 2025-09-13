import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[][] arr;
	static int[][] val;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new int[n][3];
        val = new int[n][3];
        StringTokenizer st;
        
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	for(int j=0;j<3;j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        val[0][0] = arr[0][0];
        val[0][1] = arr[0][1];
        val[0][2] = arr[0][2];
        
        for(int i=1;i<n;i++) {
        	for(int j=0;j<3;j++) {
        		int snum = 100001;
        		for(int k=0;k<3;k++) {
        			if(j == k) continue;
        			if(val[i-1][k] < snum) {
        				snum = val[i-1][k];
        			}
        		}
        		val[i][j] = snum + arr[i][j];
        	}
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<3;i++) {
        	if(val[n-1][i] < min) {
        		min = val[n-1][i];
        	}
        }
        
        bw.write(String.valueOf(min));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
