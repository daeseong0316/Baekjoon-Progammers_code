import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());
        	
        	list.add(num);
        }
        
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++) {
        	bw.write(list.get(i) + "\n");        	
        }
        
        bw.flush();
        bw.close();
    }
}
