import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// 버스의 개수
        int t = Integer.parseInt(st.nextToken());	// 영식이 버스터미널 도착 시간
        
        long minres = -1;	// 모든 노선 중 가장 빠른 시간
        
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	long s = Long.parseLong(st.nextToken());	// 시작 시간
        	int l = Integer.parseInt(st.nextToken());	// 간격
        	int c = Integer.parseInt(st.nextToken());	// 대수
        
        	long res = -1;
            int low = 0;
            int high = c - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                long time = s + (long)l * mid;

                if (time >= t) {
                    res = time; // 탈 수 있는 차 발견
                    high = mid - 1;               // 더 앞의 차가 있는지 확인
                } else {
                    low = mid + 1;                // 너무 빨리 왔으니 뒤의 차 확인
                }
            }
        	
        	if(res != -1) {
        		long time = res - t;	// 걸리는 시간
        		
        		// 가장 빠른 시간으로 업데이트
        		if(minres == -1 || time < minres) {
        			minres = time;
        		}
        	}
        }
        
        bw.write(String.valueOf(minres));
        
        bw.flush();
        bw.close();
    }
}
