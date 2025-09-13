import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
         StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        
        int count = 0;
        int left = 0, right = arr.length-1;
        
        Arrays.sort(arr);
        
        while(left < right) {
        	int sum = arr[left] + arr[right];
        	if(sum == m) {
        		count++;
        		left++;
        		right--;
        	}
        	else if(sum < m) {
        		left++;
        	}
        	else {
        		right--;
        	}
        }
        
        bw.write(String.valueOf(count));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
