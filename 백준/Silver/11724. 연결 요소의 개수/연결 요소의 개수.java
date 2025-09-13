import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] graph;	// 인접 리스트로 그래프 저장
	static boolean[] visited;			// 정점 방문 여부
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=1;i<=n;i++) {
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<m;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int u = Integer.parseInt(st.nextToken());
        	int v = Integer.parseInt(st.nextToken());
        	graph[u].add(v);
        	graph[v].add(u);
        }
        
        int count = 0;
        for(int i=1;i<=n;i++) {
        	if(!visited[i]) {
        		bfs(i);
        		count++;
        	}
        }
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
    }
    static void bfs(int node) {
    	Queue<Integer> que = new LinkedList<>();
    	visited[node] = true;
    	que.offer(node);
    	
    	while(!que.isEmpty()) {
    		int current = que.poll();
    		for(int next: graph[current]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				que.offer(next);
    			}
    		}
    	}
    }
    static void dfs(int node) {
    	visited[node] = true;
    	for(int next: graph[node]) { 
	    	if(!visited[next]) {
	    		dfs(next);
	    	}
    	}
    }
}
