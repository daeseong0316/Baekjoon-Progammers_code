import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();	// 9	8	/ X사 1리터당 요금
        int b = sc.nextInt();	// 100	300	/ Y사 기본 요금
        int c = sc.nextInt();	// 20	100	/ Y사 기본요금 사용량 상한
        int d = sc.nextInt();	// 3	10	/ Y사 1리터당 추가요금
        int p = sc.nextInt();	// 10	250	/ JOI군 한 달 수도 양
        
        int ap = a * p;
        int yp = 0;
        if(p > c) {
        	yp = b + (d * (p-c));
        }
        else {
        	yp = b;
        }
        
        System.out.println(Math.min(ap, yp));
        
        sc.close();
    }
}