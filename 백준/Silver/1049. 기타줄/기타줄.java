import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// 끊어진 기타줄 n개
        int m = Integer.parseInt(st.nextToken());	// 기타줄 브랜드 m개
        
        int minPackage = 1001;
        int minpiece = 1001;
        for(int i=0;i<m;i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int Package = Integer.parseInt(st.nextToken());		// 전체 줄을 샀을 때
        	int piece = Integer.parseInt(st.nextToken());	// 낱개로 샀을 때
        	
        	minPackage = Math.min(minPackage, Package);		// 패키지 중 가장 싼 가격 찾기
        	minpiece = Math.min(minpiece, piece);		// 낱개 중 가장 싼 가격 찾기
        }
        
        int res1 = ((n/6)+1) * minPackage;	// 패키지로 전부 샀을 때
        
        int res2 = (n/6) * minPackage + (n%6) * minpiece;	// 패키지로 사고 남은 줄은 낱개로 샀을 때
        
        int res3 = n * minpiece;	// 낱개로 전부 샀을 때
        
        int result = Math.min(res1, Math.min(res2, res3));	// 가장 싼 금액 찾기
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
