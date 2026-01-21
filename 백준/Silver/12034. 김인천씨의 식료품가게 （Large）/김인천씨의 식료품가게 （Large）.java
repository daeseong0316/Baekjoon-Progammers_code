import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=1;i<=t;i++) {
        	int n = Integer.parseInt(br.readLine());	// 제품 개수
        	
        	int[] p = new int[n * 2];
        	HashMap<Integer, Integer> map = new HashMap<>();
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<n*2;j++) {
        		p[j] = Integer.parseInt(st.nextToken()); 	// 할인된 가격과 원래 가격 오름차순 입력
        		map.put(p[j], map.getOrDefault(p[j], 0) + 1);	// 숫자 개수 카운팅
        	}
        	
        	bw.write("Case #" + i + ":");

        	for(int j=0;j<n*2;j++) {
        		int discountPrice = p[j];
        		
        		if(map.get(discountPrice) == 0) continue;	// 이미 다른 할인가의 '정상가'로 지목되어 소모된 경우 건너뜀
        		
        		bw.write(" " + discountPrice);	// 출력
        		
        		map.put(discountPrice, map.get(discountPrice) - 1);	// 현재 할인가 사용 처리
        		
        		// 대응하는 정상가 계산 및 사용 처리 
        		int originalPrice = (int)((long)discountPrice / 3 * 4);
                map.put(originalPrice, map.get(originalPrice) - 1);
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}
