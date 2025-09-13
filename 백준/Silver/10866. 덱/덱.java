import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");
        	String op = str[0];
        	int x = 0;
        	switch(op) {
        	case "push_front": 
        		x = Integer.parseInt(str[1]);
        		que.addFirst(x);
        		break;
        	case "push_back":
        		x = Integer.parseInt(str[1]);
        		que.addLast(x);
        		break;
        	case "pop_front":
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.pollFirst());
        		}
        		break;
        	case "pop_back":
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.pollLast());
        		}
        		break;
        	case "size":
        		System.out.println(que.size());
        		break;
        	case "empty":
        		if(que.isEmpty()) {
        			System.out.println("1");
        		}
        		else {
        			System.out.println("0");
        		}
        		break;
        	case "front":
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.getFirst());
        		}
        		break;
        	case "back":
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.getLast());
        		}
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
