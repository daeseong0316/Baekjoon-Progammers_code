import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int num = 1;
		int[] arr = new int[1001];
		for(int i=1;i<=1000;i++) {
			for(int j=0;j<i;j++) {
				if(num > 1000) {
					break;
				}
				arr[num] = i;
				num++;
			}
		}
		
		int sum = 0;
		for(int i=n1;i<=n2;i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}