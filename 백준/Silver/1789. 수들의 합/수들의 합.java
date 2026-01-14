import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long s = Long.parseLong(br.readLine());	// 서로 다른 N개의 자연수의 합 S 입력
        
        long sum = 0;	// 서로 다른 n개의 합을 저장하는 변수
        int i = 0;	// 더할 변수
        while(true) {
        	i++;	// 1씩 늘어남
        	sum += i;	// 1부터 순서대로 저장 
        	
        	if(sum == s) {	// 만약 알맞게 떨어지면 마지막 수 출력
        		bw.write(String.valueOf(i));
        		break;
        	}
        	else if(sum > s) {	// s를 초과하면 i-1 출력
        		bw.write(String.valueOf(i-1));
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
