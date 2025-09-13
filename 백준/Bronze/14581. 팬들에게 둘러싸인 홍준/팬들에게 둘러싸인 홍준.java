import java.util.Scanner;

public class Main {
	public static void FanPrint3() {
		for(int i=0;i<3;i++) {
			System.out.print(":fan:");
		}
		System.out.println();
	}
	public static void Name(String name) {
		System.out.print(":fan:");
		System.out.print(":" + name + ":");
		System.out.print(":fan:");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		name = sc.nextLine();
		
		FanPrint3();
		Name(name);
		FanPrint3();
	}

}
