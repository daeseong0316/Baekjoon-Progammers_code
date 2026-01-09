import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String bn = Integer.toBinaryString(n);
        
        StringBuilder sb = new StringBuilder(bn);
        String reversed = sb.reverse().toString();
        
        int result = Integer.parseInt(reversed, 2);
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
