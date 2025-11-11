import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int d = Integer.parseInt(br.readLine());
        
        int total = a*3600 + b*60 + c;
        total += d;
        
        total %= 86400;
        
        a = total / 3600;
        b = (total % 3600) / 60;
        c = total % 60;
        
        bw.write(a + " " + b + " " + c);
        
        bw.flush();
        bw.close();
    }
}
