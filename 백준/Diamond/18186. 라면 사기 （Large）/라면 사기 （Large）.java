import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 공장 수
        int b = Integer.parseInt(st.nextToken());  // 기본 가격
        int c = Integer.parseInt(st.nextToken());  // 추가 묶음 가격

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long total = 0;

        if (c >= b) {
            for (int i = 0; i < n; i++) {
                total += (long) arr[i] * b;
            }
        } else {
            for (int i = 0; i < n - 2; i++) {
                if (arr[i + 1] > arr[i + 2]) {
                    int two = Math.min(arr[i], arr[i + 1] - arr[i + 2]);
                    if (two > 0) {
                        arr[i] -= two;
                        arr[i + 1] -= two;
                        total += (long) two * (b + c);
                    }
                }

                int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                if (three > 0) {
                    arr[i] -= three;
                    arr[i + 1] -= three;
                    arr[i + 2] -= three;
                    total += (long) three * (b + 2 * c);
                }

                int two = Math.min(arr[i], arr[i + 1]);
                if (two > 0) {
                    arr[i] -= two;
                    arr[i + 1] -= two;
                    total += (long) two * (b + c);
                }

                if (arr[i] > 0) {
                    total += (long) arr[i] * b;
                    arr[i] = 0;
                }
            }

            int lastTwo = Math.min(arr[n - 2], arr[n - 1]);
            arr[n - 2] -= lastTwo;
            arr[n - 1] -= lastTwo;
            total += (long) lastTwo * (b + c);

            total += (long) arr[n - 2] * b;
            total += (long) arr[n - 1] * b;
        }

        System.out.println(total);
    }
}
