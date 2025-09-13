// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		
		int count = 0;
		int time = 0;
		int mb = m;
		
		if((mb + T) > M) {
			System.out.println("-1");
		}
		else {
			while(count < N) {
				if(mb >= m && (mb + T) <= M) {
					mb += T;
					count++;
					time++;
				}
				else if(mb >= M || (mb + T) > M) {
					if((mb - R) < m) {
						mb = m;
					}
					else {
						mb -= R;
					}
					time++;
				}
			}
			System.out.println(time);
		}
	}
}