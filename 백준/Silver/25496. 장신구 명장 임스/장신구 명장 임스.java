import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());	// 현재 피로도
        int n = Integer.parseInt(st.nextToken());	// 장신구 개수
        
        int arr[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st1.nextToken());	// 배열에 장신구에 필요한 피로도 넣기 
        }
        
        Arrays.sort(arr);	// 오름차순으로 정렬
        
        int count = 0;	// 만들 수 있는 개수
        for(int i=0;i<n;i++) {
        	if(p >= 200) {	// 피로도가 200이 넘으면 더 이상 못 만듦
        		break;
        	}
        	p += arr[i];	// 장신구를 만들 때마다 피로도 추가
        	count++;	// 개수 추가
        }
        
        bw.write(String.valueOf(count));	// 만들 수 있는 장신구 개수 출력
        
        bw.flush();
        bw.close();
    }
}
