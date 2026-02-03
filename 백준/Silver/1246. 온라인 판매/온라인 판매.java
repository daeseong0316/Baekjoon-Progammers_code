import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// 달걀의 개수
        int m = Integer.parseInt(st.nextToken());	// 손님 수
        
        int arr[] = new int[m];
        for(int i=0;i<m;i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        long maxProfit = 0;   // 최대 수익
        int bestPrice = 0;    // 그때의 가격

        // 2. 각 고객이 제시한 가격을 판매가로 가정하고 계산
        for (int i = 0; i < m; i++) {
            int currentPrice = arr[i]; // 현재 고려 중인 가격
            
            // 현재 가격 이상으로 살 수 있는 사람 수 = 전체 M명 - 현재 인덱스 i
            int potentialBuyers = m - i;
            
            // 실제 팔 수 있는 개수 = 손님 수와 달걀 수(N) 중 작은 값
            int actualSales = Math.min(potentialBuyers, n);
            
            // 현재 수익 계산
            long currentProfit = (long) currentPrice * actualSales;

            // 3. 최대 수익 갱신
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                bestPrice = currentPrice;
            }
        }
        
        bw.write(String.valueOf(bestPrice + " " + maxProfit));
        
        bw.flush();
        bw.close();
    }
}
