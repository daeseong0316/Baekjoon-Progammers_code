import java.io.*;
import java.util.*;

public class Main {
	static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n, m;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
        	String[] str = br.readLine().split(" ");
        	m = Integer.parseInt(str[0]);	// 배추 밭 가로 길이
        	n = Integer.parseInt(str[1]);	// 배추 밭 세로 길이
        	int k = Integer.parseInt(str[2]);	// 배추가 심어져 있는 위치의 개수 
        	
        	field = new int[n][m];
        	visited = new boolean[n][m];
        	
        	for(int i=0;i<k;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int x = Integer.parseInt(st.nextToken());
        		int y = Integer.parseInt(st.nextToken());
        		field[y][x] = 1;
        	}
        	
        	int count = 0;
        	for (int i=0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }
        
        bw.flush();
        bw.close();
    }
    static void bfs(int x, int y) {
    	Queue<int[]> que = new LinkedList<>();
    	que.offer(new int[] {x, y});
    	visited[x][y] = true;
    	
    	while(!que.isEmpty()) {
    		int[] cur = que.poll();
    		int cx = cur[0];
            int cy = cur[1];
    		for(int i=0;i<4;i++) {
    			int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (field[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        que.offer(new int[] { nx, ny });
                    }
                }
    		}
    	}
    }
}
