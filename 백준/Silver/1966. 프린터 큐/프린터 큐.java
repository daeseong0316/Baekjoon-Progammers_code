import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        for(int i=0;i<test;i++) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	
        	Queue<int[]> que = new ArrayDeque<>();
        	for(int j=0;j<n;j++) {
        		int num = sc.nextInt();
        		que.offer(new int[] {j, num});
        	}
        	int count = 0;	// 인쇄한 횟수
        	while(!que.isEmpty()) {		// que가 비워있지 않다면
        		int[] now = que.poll();		// que의 제일 앞의 노드
        		
        		boolean check = false;
        		for(int[] q: que) {			// que의 배열을 순회
	        		if(now[1] < q[1]) {		// que의 제일 앞에 인덱스의 중요도 보다 큰 중요도 찾기
	        			check = true;		// 찾으면 true로 바꿈
	        			break;
	        		}
        		}
        		if(check) {		// 제일 앞 인덱스의 중요도 보다 큰 중요도가 있을 경우
        			que.offer(now);	// 제일 앞에 값을 제일 뒤로 보냄 
        		}
        		else {	// 제일 앞에 인덱스의 중요도가 제일 클 경우
        			count++;
        			if(now[0] == m) {	// 내가 인쇄하고 싶은 문서가 인쇄 될 경우
            			break;
            		}
        			que.peek();	// 중요도가 제일 큰 값을 제거
        		}
        	}
        	System.out.println(count);
        }
    }
}
