import java.io.*;
import java.util.*;

public class Main {
	 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();	// 9
		int M = in.nextInt();	// 23
 
		arr = new boolean[N][M];	// arr[9][23]
		
		// 배열 입력 
		for (int i = 0; i < N; i++) {	// 9번 반복
			String str = in.next();		// 한 줄씩 문자 입력
			for (int j = 0; j < M; j++) {	// 23번 반복
				if (str.charAt(j) == 'W') {	// 1개씩 꺼냈을 때 w라면
					arr[i][j] = true;		// W일 때는 true 
				} else {
					arr[i][j] = false;		// B일 때는 false
				}
			}
		}
		
		// 8x8 체스판을 만들 수 있는 시작점의 최대 범위 
		int N_row = N - 7;	// 2
		int M_col = M - 7;	// 16
 
		for (int i = 0; i < N_row; i++) {	// 2번 반복
			for (int j = 0; j < M_col; j++) {	// 16번 반복
				find(i, j);		// 각 시작점에서 find함수 호출
			}
		}
		System.out.println(min);	// 최솟값 출력
	}
	
	// 8x8 체스판을 확인하는 함수
	public static void find(int x, int y) {
		int end_x = x + 8;	// 마지막 점 17 
		int end_y = y + 8;	// 마지막 점 31
		int count = 0;
 
		boolean TF = arr[x][y];		//	시작점이 w인지 b인지 검사 
 
		for (int i = x; i < end_x; i++) {	// 열 8칸 
			for (int j = y; j < end_y; j++) {	// 행 8칸 
				if (arr[i][j] != TF) {	// 현재 색과 실제 색이 같은지 검사
					count++;	// 다르면 count 증가
				}
				TF = (!TF);	// 현재 색을 바꾼다
			}
			TF = !TF; 	// 다음 줄로 바뀌도 색 변경
		}
		
		count = Math.min(count, 64 - count);	// 다른 색 개수
		min = Math.min(min, count);		// 가장 적은 개수
	}
}
