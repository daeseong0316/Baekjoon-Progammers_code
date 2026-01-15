import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());	// 스크린 개수
        int m = Integer.parseInt(st.nextToken());	// 바구니 크기
        int j = Integer.parseInt(br.readLine());	// 떨어지는 사과 개수

        int left = 1;	// 바구니 왼쪽 끝
        int right = m;	// 바구니 오른쪽 끝
        int totalDistance = 0;	// 총 움직인 횟수

        for(int i=0;i<j;i++) {
        	int apple = Integer.parseInt(br.readLine());	// 떨어지는 사과 위치
            
            if (apple > right) {
                // 오른쪽으로 이동해야 하는 거리 계산
                int move = apple - right;
                totalDistance += move;
                right = apple;      // 바구니의 오른쪽 끝을 사과 위치로
                left += move;       // 왼쪽 끝도 같이 이동
            } 
            else if (apple < left) {
                // 왼쪽으로 이동해야 하는 거리 계산
                int move = left - apple;
                totalDistance += move;
                left = apple;       // 바구니의 왼쪽 끝을 사과 위치로
                right -= move;      // 오른쪽 끝도 같이 이동
            }
            // 바구니 범위 내에 있으면 아무것도 안 함
        }
        
        bw.write(String.valueOf(totalDistance));
        
        bw.flush();
        bw.close();
    }
}
