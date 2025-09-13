import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int count = 0;
        while (num >= 0) {
            if(num % 5 == 0) {
                count += num / 5;
                bw.write(String.valueOf(count));;
                break;
            }
            num -= 2;	
            count++;
        }
        
        if(num < 0) {
            bw.write("-1");
        }
        
        bw.flush();
        bw.close();
    }
}
