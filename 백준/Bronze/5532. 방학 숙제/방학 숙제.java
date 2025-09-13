import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 방학은 총 L일이다.수학은 총 B페이지, 국어는 총 A페이지를 풀어야 한다.상근이는 하루에 국어를 최대 C페이지, 수학을 최대 D페이지 풀 수 있다.
        int L, A, B, C, D;
        int ac = 0, bd = 0; // ac = 국어 일수, bd는 수학 일수

        L = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        ac = (int) Math.ceil((double) A / C);
        bd = (int) Math.ceil((double) B / D);

        int max_day = Math.max(ac, bd);

        System.out.println(L - max_day);
		
		sc.close();
	}

}