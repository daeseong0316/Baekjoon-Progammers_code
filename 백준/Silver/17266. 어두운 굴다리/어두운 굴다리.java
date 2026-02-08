import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());	// 굴다리의 길이
        int m = Integer.parseInt(br.readLine());	// 가로등의 개수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x[] = new int[m];
        for(int i=0;i<m;i++) {
        	x[i] = Integer.parseInt(st.nextToken());	// 설치하는 가로등 위치
        }
        
        // 이진 탐색 설정
        int low = 1;	
        int high = n;
        int h = n;
        while(low <= high) { 
        	int mid = (low + high) / 2;
        	
        	if(canIlluminate(mid, n, x)) {
        		h = mid;	// 현재 높이로 가능
        		high = mid - 1;	// 높이 감소
        	}
        	else {
        		low = mid + 1;	// 높이 증가
        	}
        }
        bw.write(String.valueOf(h));	// 출력
        
        bw.flush();
        bw.close();
    }
    // 특정 높이 h로 0부터 n까지 모든 길을 비출 수 있는지 확인하는 함수
    public static boolean canIlluminate(int h, int n, int[] x) {
    	int lastbright = 0;	// 현재까지 밝혀진 구간의 끝 지점
    	
    	// 현재 가로등이 비추는 왼쪽 끝(x[i] - h)이 
        // 이전에 밝혀진 끝(lastBright)보다 뒤에 있으면 빈틈 발생
    	for(int i=0;i<x.length;i++) {
    		if(x[i]-h > lastbright) {
    			return false;
    		}
    		lastbright = x[i] + h;	// 현재 가로등이 비추는 오른쪽 끝으로 갱신
    	}
    	
    	// 마지막 가로등의 빛이 굴다리 끝(n)까지 닿는지 최종 확인
    	return lastbright >= n;
    }
}
