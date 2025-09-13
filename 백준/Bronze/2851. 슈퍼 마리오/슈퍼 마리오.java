// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sum += num;

            if (Math.abs(100 - sum) <= Math.abs(100 - answer)) {
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}