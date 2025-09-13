import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int count = 0;	// 1번 네트워크와 연결 된 바이러스의 개수 
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	int x = Integer.parseInt(st.nextToken());
        	arr[i] = x;
        	set.add(x);
        }
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        Map<Integer, Integer> rank = new HashMap<>();
        for(int i=0;i<list.size();i++) {
        	rank.put(list.get(i), i);
        }
        
        int[] result = new int[n];
        for(int i=0;i<arr.length;i++) {
        	if(rank.containsKey(arr[i])) {
        		result[i] = rank.get(arr[i]);
        	}
        }
        
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
