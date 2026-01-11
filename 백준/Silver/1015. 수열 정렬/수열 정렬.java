import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 숫자의 개수 입력
        
        int arr[] = new int[n];	// 숫자 개수에 맞는 배열 공간 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// 배열에 숫자 입력
        }
        
        int sort[] = arr.clone();	// 새로운 배열에 arr 배열 복사
        Arrays.sort(sort);	// arr 배열에서 복사한 배열 정렬
        
        int p[] = new int[n];	// 결과를 출력 할 배열
        
        // arr 배열과 sort 배열을 비교
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(arr[i] == sort[j]) {
        			p[i] = j;	// 같으면 등수를 p 배열에 담는다.
        		
        			sort[j] = -1;	// 같은 값이 또 나올수도 있기 때문에 다시 선택 되지 않도록 값을 변경
        		
        			break;	// 등수를 찾았으니 다음 등수를 찾는다.
        		}
        	}
        }
        
        // 결과 출력
        for(int i=0;i<p.length;i++) {
        	bw.write(String.valueOf(p[i] + " "));
        }
        
        bw.flush();
        bw.close();
    }
}
