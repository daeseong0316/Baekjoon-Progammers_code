import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());	// 제품 개수
        
        long result = 0;	// 최송 비용 가격
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(br.readLine());	// 가격 입력
        }
        
        Arrays.sort(arr, Collections.reverseOrder());	// 내림차순으로 정렬
        
        for(int i=0;i<n;i++) {
        	if((i+1) % 3 != 0) {	// 3번째 가격은 금액에서 제외
        		result += arr[i];
        	}
        }
        
        bw.write(String.valueOf(result));	// 출력
        
        bw.flush();
        bw.close();
    }
}
