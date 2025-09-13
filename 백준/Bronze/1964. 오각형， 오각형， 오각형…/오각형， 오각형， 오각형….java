import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long result = 1;
		for(int i=0;i<n;i++) {
			result = result + 4 + i*3; 
		}
		long a = result % 45678;
		
		System.out.println(a);
		
		sc.close();
	}

}
