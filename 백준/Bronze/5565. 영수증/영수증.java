import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int num = 10;
        
        int arr[] = new int[10];
        
        for(int i=0;i<num;i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        int imsi = arr[0];
        
        for(int i=1;i<num;i++) {
        	imsi -= arr[i];
        }
        
        System.out.println(imsi);
        
        bw.flush();
        bw.close();
    }
}
