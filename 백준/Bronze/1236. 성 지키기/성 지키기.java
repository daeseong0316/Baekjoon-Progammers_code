// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		char[][] ch = new char[n][m];
		for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            ch[i] = line.toCharArray();
        }
		
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(ch[i][j] == 'X') {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		int emptyRow = 0;
		for(boolean b: row) {
			if(!b) {
				emptyRow++;
			}
		}
		
		int emptyCol = 0;
		for(boolean b: col) {
			if(!b) {
				emptyCol++;
			}
		}
		
		System.out.println(Math.max(emptyRow, emptyCol));
	}
}