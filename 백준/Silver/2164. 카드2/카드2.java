import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         
        Deque<Integer> que = new ArrayDeque<>();
        for(int i=1;i<=n;i++) {
        	que.offer(i);
        }
        
        while(que.size() > 1) {
        	que.poll();
        	que.offer(que.poll());
        }
        System.out.println(que.peek());
    }
}

