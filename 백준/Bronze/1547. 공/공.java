import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        Vector<Integer> vec = new Vector<>(Arrays.asList(1, 2, 3)); 
        
        int m = Integer.parseInt(st.nextToken());
        int n1, n2;
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 매번 새로운 입력 읽기
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            
            if (n1 == vec.get(0)) {
                vec.add(0, n2);
            } else if (n2 == vec.get(0)) {
                vec.add(0, n1);
            }
        }
        
        bw.write(String.valueOf(vec.get(0))); // 정수를 문자열로 변환 후 출력
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
