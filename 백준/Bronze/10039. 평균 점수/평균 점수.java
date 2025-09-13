import java.util.Scanner;

public class Main {
		public static final int Student = 5;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0, average = 0;
		
		for(int i=0;i< Student;i++) {
			score[i] = sc.nextInt();
			
			if(score[i] < 40) {
				score[i] = 40;
			}
			
			sum += score[i];
		}
		
		average = sum / Student;
		
		System.out.println(average);
		
		sc.close();
	}

}
