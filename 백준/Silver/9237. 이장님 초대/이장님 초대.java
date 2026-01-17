import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 묘목 수
        
        Integer arr[] = new Integer[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<t;i++) {
        	
        	arr[i] = Integer.parseInt(st.nextToken());	// 나무 당 걸리는 시간
        }
        
        Arrays.sort(arr, Collections.reverseOrder());	// 기간을 내림 차순으로 정렬
        
        int max = 0;	
        for(int i=0;i<t;i++) {
        	int emp = (i + 1) + arr[i];	// i번째 나무가 다 자라는 날
        	
        	if(emp > max) {
        		max = emp;	// 그중 가장 늦게 자라는 날 기록
        	}
        }
        
        int result = max + 1;	// 기간 계산
        
        bw.write(String.valueOf(result));	// 출력
        
        bw.flush();
        bw.close();
    }
}
