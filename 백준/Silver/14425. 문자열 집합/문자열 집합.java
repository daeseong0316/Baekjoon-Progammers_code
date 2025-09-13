import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<n;i++) {
        	set.add(br.readLine());
        }

        int count = 0;
        
        for(int i=0;i<m;i++) {
        	if(set.contains(br.readLine())) {
        		count++;
        	}
        }
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
    }
}
