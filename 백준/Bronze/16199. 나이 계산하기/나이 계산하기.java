import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 태어난 생년월일 입력
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        // 기준 날짜 입력
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        // 만, 세는, 연 나이
		int Man = 0, Se = 0, Yeon = 0;

		// 만 나이 계산 
		if(month < month2) {    
		    Man = year2 - year;
		}
		else if (month == month2 && day <= day2) {
		    Man = year2 - year;
		}
		else {
		    Man = year2 - year - 1;
		}

		// 세는 나이 
		Se = year2 - year + 1;

		// 연 나이
		Yeon = year2 - year;
		
		System.out.print(Man + "\n" + Se + "\n" + Yeon);
		
		sc.close();
	}

}
