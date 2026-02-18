import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = pooling(0, 0, n);
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int pooling(int r, int c, int size) {
        if (size == 2) {
            int[] temp = new int[4];
            int idx = 0;
            for (int i = r; i < r + 2; i++) {
                for (int j = c; j < c + 2; j++) {
                    temp[idx++] = arr[i][j];
                }
            }
            Arrays.sort(temp);
            return temp[2];
        }

        int nextSize = size / 2;
        int[] subResults = new int[4];

        subResults[0] = pooling(r, c, nextSize);
        subResults[1] = pooling(r, c + nextSize, nextSize);
        subResults[2] = pooling(r + nextSize, c, nextSize);
        subResults[3] = pooling(r + nextSize, c + nextSize, nextSize);

        Arrays.sort(subResults);
        return subResults[2];
    }
}