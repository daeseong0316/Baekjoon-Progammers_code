import java.util.Scanner;

public class Main {
	public static final int School = 1946;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int number = sc.nextInt();
		
		result = number - School;
		
		System.out.print(result);
	}
}
