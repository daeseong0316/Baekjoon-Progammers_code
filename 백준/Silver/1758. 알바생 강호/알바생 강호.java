import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());	// 인원
        
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(br.readLine());	// 팁
        }
        
        Arrays.sort(arr, Collections.reverseOrder());	// 내림차순으로 정렬
        
        long result = 0;	// 총 받는 돈
        int c = 0;	// 받는 등수(줄어드는 돈)
        for(int i=n-1;i>=0;i--) {
        	int res = arr[c]-(c+1-1);
        	
        	if(res > 0) {
        		result += res;	// 팁 저장
        	}
        	c++;
        }
        
        bw.write(String.valueOf(result));	// 출력
        
        bw.flush();
        bw.close();
    }
}
