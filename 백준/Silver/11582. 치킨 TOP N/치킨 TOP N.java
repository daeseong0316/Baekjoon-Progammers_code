import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());	// 치킨집 개수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// 치킨 집 맛 수치 
        }
        
        int k = Integer.parseInt(br.readLine());	// 현재 정렬을 진행중인 회원들의 수
        
    	int emp = n / k;
    	for(int i=0;i<n;i+=emp) {
    		// Arrays.sort(배열, 시작점, 끝점) -> 시작점 <= index < 끝점
    		Arrays.sort(arr, i, i + emp);
    	}
        
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<n;i++) {
    		sb.append(arr[i] + " ");	// sb에 넣기
    	}
        
    	bw.write(sb.toString().trim());		// 출력
    	bw.newLine();
        
        bw.flush();
        bw.close();
        br.close();
    }
}