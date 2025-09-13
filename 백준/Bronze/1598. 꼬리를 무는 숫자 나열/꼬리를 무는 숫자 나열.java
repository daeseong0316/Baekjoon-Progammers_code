import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int xw, yw, xh, yh;
		int result = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		xw = (x - 1) / 4;
		yw = (y - 1) / 4;
		
		xh = (x - 1) % 4;
		yh = (y - 1) % 4;
		
		result = Math.abs(xh - yh) + Math.abs(xw - yw);
		
		System.out.println(result);
		
		sc.close();
	}

}
