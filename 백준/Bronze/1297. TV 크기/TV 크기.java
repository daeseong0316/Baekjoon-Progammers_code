// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double temp = (double)(a * a) / (b * b + c * c);
        double result = Math.sqrt(temp);
        
        System.out.println((int)(result * b) + " " + (int)(result * c));
    }
}