import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
        	arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
        	arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i: arr1) {
        	list.add(i);
        }
        for(int i: arr2) {
        	list.add(i);
        }
        
        Collections.sort(list);
        
        for(int i: list) {
        	bw.write(i + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
