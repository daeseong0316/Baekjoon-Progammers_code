import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			String[] b = a.split("D-");
			if(Integer.parseInt(b[1]) <= 90) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}