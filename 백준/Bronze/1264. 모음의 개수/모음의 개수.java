import java.util.Arrays;
import java.util.Scanner;

public class Main {
		public static final int Student = 5;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str;

		for (;;) {
		    str = sc.nextLine();

		    if (str.equals("#")) {
		        break;
		    }
		    str = str.toLowerCase();
		    int len = str.length();

		    int count = 0;
		    for (int i = 0; i < len; i++) {
		        char ch = str.charAt(i);

		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            count++;
		        }
		    }

		    System.out.println(count);

		}
		
		sc.close();
	}

}