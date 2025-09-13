import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(br.readLine());
        int[] n = new int[46];
        n[0] = 0;
        n[1] = 1;
        
        for(int i=2;i<=num;i++) {
        	n[i] = n[i-1] + n[i-2];
        }
        bw.write(String.valueOf(n[num]));
        
        bw.flush();
        bw.close();
    }
}
