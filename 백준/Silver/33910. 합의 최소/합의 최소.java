import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 수열의 개수
        
        long arr[] = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Long.parseLong(st.nextToken());	// 숫자 입력
        }

        // 뒤에서부터 작은 수로 바꿈 / n-1은 바꾸지 못하니 n-2부터 수행
        for(int i=n-2;i>=0;i--) {
        	if(arr[i] > arr[i+1]) {
        		arr[i] = arr[i+1];
        	}
        }
        
        long sum = 0;
        for(int i=0;i<n;i++) {
        	sum += arr[i];	// 가장 작은 수열의 총 합
        }
        
        bw.write(String.valueOf(sum));	// 출력
        
        bw.flush();
        bw.close();
    }
}
