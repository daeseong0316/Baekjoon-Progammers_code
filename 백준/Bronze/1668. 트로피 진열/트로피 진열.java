// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] TrophyHeight = new int[n];
		for(int i=0;i<n;i++) {
			TrophyHeight[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int right = TrophyHeight.length;
		int l_count = 0, r_count = 0;
		int temp1 = 0, temp2 = 0;
		for(int i=0;i<n;i++) {
			if(temp1 < TrophyHeight[i]) {
				temp1 = TrophyHeight[i];
				l_count++;
			}
			if(temp2 < TrophyHeight[right-1-i]) {
				temp2 = TrophyHeight[right-1-i];
				r_count++;
			}
		}
		System.out.println(l_count);
		System.out.println(r_count);
	}
}