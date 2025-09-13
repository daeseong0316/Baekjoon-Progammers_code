// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y = sc.next();
		
		String revX = new StringBuilder(x).reverse().toString();
		String revY = new StringBuilder(y).reverse().toString();
		
		int z = Integer.parseInt(revX) + Integer.parseInt(revY);
		String revZ = String.valueOf(z);
		String resultRevZ = new StringBuilder(revZ).reverse().toString();
		
		System.out.println(Integer.parseInt(resultRevZ));
	}
}