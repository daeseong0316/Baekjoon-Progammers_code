import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
     // 16진수 입력을 문자열로 읽음
        String hexNumber = br.readLine();
        
        // 16진수 문자열을 정수(10진수)로 변환
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        
        // 10진수 출력
        System.out.println(decimalNumber);
        bw.flush();
        bw.close();
    }
}
