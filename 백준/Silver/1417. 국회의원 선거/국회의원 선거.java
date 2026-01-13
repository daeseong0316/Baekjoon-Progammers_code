import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 테스트 개수
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(br.readLine());	// 투표 수 입력
        }
        
        if (n == 1) {	// 나 밖에 없으면 0회
            bw.write("0");
        } else {
	        int count = 0;	// 뺏은 횟수 
	        while(true) {
	        	// 가장 투표 수가 많은 인덱스 찾기
	        	int maxIndex = 1;	
	        	for(int i=2;i<arr.length;i++) {
	        		if(arr[i] > arr[maxIndex]) {
	        			maxIndex = i;
	        		}
	        	}
	        	
	        	// 투표 수 조작
	        	if (arr[maxIndex] >= arr[0]) {
                    arr[maxIndex]--; // 경쟁자 표 -1
                    arr[0]++;        // 내 표 +1
                    count++;         // 뺏은 횟수 +1
                } else {
                    // 내가 독보적인 1등이 되면 반복 종료
                    break;
                }
	        } 
	        bw.write(String.valueOf(count));	// 뺏은 개수 출력
        }
        
        bw.flush();
        bw.close();
    }
}
