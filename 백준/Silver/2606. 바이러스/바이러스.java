import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int count = 0;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int u = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[u+1];
        visited = new boolean[u+1];
        for(int i=1;i<=u;i++) {
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<v;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	graph[a].add(b);
        	graph[b].add(a);
        }
        
        bfs(1);
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
    }
    static void bfs(int node) {
    	Queue<Integer> que = new LinkedList<>();
    	visited[node] = true;
    	que.offer(node);
    	
    	while(!que.isEmpty()) {
    		int cur = que.poll();
    		for(int next: graph[cur]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				que.offer(next);
    				count++;
    			}
    		}
    	}
    }
}
