import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {        	
        	int num = Integer.parseInt(st.nextToken());
        	set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        for(int i: list) {
        	bw.write(i + " ");
        }
        
        
        bw.flush();
        bw.close();
    }
}
