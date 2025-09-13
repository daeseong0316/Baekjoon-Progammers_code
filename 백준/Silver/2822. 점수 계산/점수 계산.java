import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int q = 8;
        final int s = 5;
        
        int[] arr = new int[q];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<q;i++) {
        	int num = Integer.parseInt(br.readLine());
        	maxheap.offer(num);
        	arr[i] = num;
        }
        
        int sum = 0;
        List<Integer> maxlist = new ArrayList<>();
        for(int i=0;i<s;i++) {
        	int max = maxheap.poll();
        	sum += max;
        	for(int j=0;j<q;j++) {
        		if(max == arr[j]) {
        			maxlist.add(j+1);
        			break;
        		}
        	}
        }
        
        Collections.sort(maxlist);
        
        bw.write(sum + "\n");
        
        for(int i: maxlist) {
        	bw.write(i + " ");
        }        
        
        bw.flush();
        bw.close();
    }
}
