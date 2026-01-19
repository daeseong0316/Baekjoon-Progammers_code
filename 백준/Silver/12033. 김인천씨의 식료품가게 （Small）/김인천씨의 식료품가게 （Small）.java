import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=1;i<=t;i++) {
        	int n = Integer.parseInt(br.readLine());	// 제품 개수
        	
        	int p[] = new int[n*2];
        	boolean visited[] = new boolean[n*2];	// 이미 짝이 맞춰진 숫자
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<n*2;j++) {
        		p[j] = Integer.parseInt(st.nextToken());	// 원가와 할인가 섞긴 오름차순 숫자 입력
        	}
        	
        	bw.write("Case #" + i + ":");
        	
        	for(int j=0;j<n*2;j++) {
        		if(visited[j]) continue;	// 짝을 찾으면 넘어감
        		int discountPrice = p[j];	// 할인 된 가격
        		int originalPrice = discountPrice / 3 * 4;	// 세일 된 값
        		for(int k=j+1;k<n*2;k++) {
        			if(!visited[k] && p[k] == originalPrice) {
        				visited[k] = true;	// 할인 가격과 원가 짝 찾음
        				bw.write(" " + discountPrice);	
        				break;
        			}
        		}
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}
