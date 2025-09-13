import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bpn = "비와이";
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int A = 0, B = 0; 
		for(int i=0;i<N;i++) {
			A = sc.nextInt();
			B = sc.nextInt();
		}
		System.out.println(bpn);
	}
}