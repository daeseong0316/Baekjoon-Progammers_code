import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 공장 수

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long total = 0;

        
        for (int i = 0; i < n - 2; i++) {
            if (arr[i + 1] > arr[i + 2]) {
                int two = Math.min(arr[i], arr[i + 1] - arr[i + 2]);
                if (two > 0) {
                    arr[i] -= two;
                    arr[i + 1] -= two;
                    total += (long) two * 5;
                }
            }

            int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
            if (three > 0) {
                arr[i] -= three;
                arr[i + 1] -= three;
                arr[i + 2] -= three;
                total += (long) three * 7;
            }

            int two = Math.min(arr[i], arr[i + 1]);
            if (two > 0) {
                arr[i] -= two;
                arr[i + 1] -= two;
                total += (long) two * 5;
            }

            if (arr[i] > 0) {
                total += (long) arr[i] * 3;
                arr[i] = 0;
            }
        }

        int lastTwo = Math.min(arr[n - 2], arr[n - 1]);
        arr[n - 2] -= lastTwo;
        arr[n - 1] -= lastTwo;
        total += (long) lastTwo * 5;

        total += (long) arr[n - 2] * 3;
        total += (long) arr[n - 1] * 3;
        

        System.out.println(total);
    }
}
