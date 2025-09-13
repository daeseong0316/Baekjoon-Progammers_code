import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0, num = 0, num1;
        for(int i = 0; i < n; ++i) {
            num1 = Integer.parseInt(st.nextToken());
            
            if(num <= num1) {
                count++;
            }
            num = num1;
        }
        System.out.println(count);
        
        br.close();
    }
}
