import java.io.*;
import java.util.*;

public class Main {
	static int[][] paper;
	static boolean[][] visited;
	static int n, m;
	
	static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        
        paper = new int[n][m];
        visited = new boolean[n][m];
        
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<m;j++) {
        		paper[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        int count = 0;
        int max = 0;
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(paper[i][j] == 1 && !visited[i][j]) {
        			int area = bfs(i, j);
        			count++;
        			max = Math.max(max, area);
        		}
        	}
        }
        
        bw.write(count + "\n");
        bw.write(max + "\n");
        
        bw.flush();
        bw.close();
    }
    public static int bfs(int x, int y) {
    	Queue<int[]> que = new LinkedList<>();
    	que.offer(new int[] {x, y});
    	visited[x][y] = true;
    	int area = 1;
    	
    	while(!que.isEmpty()) {
    		int[] cur = que.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (paper[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        que.offer(new int[]{nx, ny});
                        area++;
                    }
                }
            }
    	}
        return area;
    }
}
