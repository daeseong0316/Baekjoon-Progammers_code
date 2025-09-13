import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a - b; // 절댓값 같으면 작은 값 우선
            }
            return absA - absB; // 절댓값 기준 정렬
        });

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (minHeap.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(minHeap.poll()).append('\n');
                }
            } else {
                minHeap.offer(num);
            }
        }

        System.out.print(sb);
    }
}
