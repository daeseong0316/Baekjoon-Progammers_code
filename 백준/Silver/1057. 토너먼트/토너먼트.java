import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// 참가자 수
        int kjm = Integer.parseInt(st.nextToken());	// 김지민 번호
        int ihs = Integer.parseInt(st.nextToken());	// 임한수 번호
        
        int round = 0;	// 라운드
        while(kjm != ihs) {	// 둘이 만나면 끝
        	round++;	// 라운드 증가
        	
        	// 매번 이김
        	kjm = (kjm+1)/2;
        	ihs = (ihs+1)/2;
        }
        
        bw.write(String.valueOf(round));	// 출력
        
        bw.flush();
        bw.close();
    }
}
