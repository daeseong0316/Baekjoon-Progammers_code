import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> card = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
        	card.offer(i+1);
        }
        
        List<Integer> list = new ArrayList<>();
        while(card.size() != 1) {
        	list.add(card.poll());
        	card.add(card.poll());
        }
        
        for(int i: list) {
        	bw.write(i + " ");
        }
        bw.write(String.valueOf(card.peek()));
        
        bw.flush();
        bw.close();
    }
}
