import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 인형의 개수 
        
        HashMap<Integer,Integer> map = new HashMap<>();	
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(st.nextToken());
        	map.put(num, map.getOrDefault(num, 0)+1);	// 인형의 크기를 입력 받으며 개수 카운팅
        }
        
        int count = 0;	// 가장 개수가 많은 크기를 저장 할 변수
        for(int i : map.values()) {
        	count = Math.max(count, i);	// 가장 많은 개수 구하기
        }
        
        bw.write(String.valueOf(count));	// 출력
        
        bw.flush();
        bw.close();
    }
}
