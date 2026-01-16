import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 주파수 A에서 B로 갈 때 눌러야 하는 가장 적은 버튼수를 구해주자.
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());	// 현재 주파수 
        int b = Integer.parseInt(st.nextToken());	// 듣고 싶은 주파수
        
        int n = Integer.parseInt(br.readLine());	//  미리 지정되어 있는 주파수
        
        TreeSet<Integer> set = new TreeSet<>();		// 바로 정렬 된다
        set.add(a);	// 처음 주파수 저장
        for(int i=0;i<n;i++) {
        	set.add(Integer.parseInt(br.readLine()));	// 즐겨찾기 주파수 저장 
        }
        
        // b보다 작거나 같은 값 중 최대, b보다 큰 값 중 최소 찾기
        Integer low = set.floor(b);		
        Integer high = set.ceiling(b);	
        
        int result = Math.abs(a - b);	// 처음 주파수에서 이동하는 경우
        
        if(low != null) {	// 작은 주파수에서 이동하는 경우
        	int emp = (low == a) ? Math.abs(low - b) : Math.abs(low - b)+1;
        	result = Math.min(result, emp);	// 더 작은 이동 범위로 변경
        }
        
        if(high != null) {	// 큰 주파수에서 이동하는 경우
        	int emp = (high == a) ? Math.abs(high - b) : Math.abs(high - b)+1;
        	result = Math.min(result, emp);	// 더 작은 이동 범위로 변경
        }
        
        bw.write(String.valueOf(result));	// 결과 출력 
        
        bw.flush();
        bw.close();
    }
}
