import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();	// 학생 수
        
        int[] size = new int[6];
        for(int i=0;i<6;i++) {	// 사이즈
        	size[i] = sc.nextInt();	// 
        }
        
        int T = sc.nextInt();	// 티셔츠 묶음 수
        int P = sc.nextInt();	// 펜 묶음 수
        
        int Tcount = 0;
        for(int i=0;i<size.length;i++) {
        	int t = size[i];
        	while(t > 0) {
        		t -= T;
        		Tcount++;
        	}
        }
        
        int Pcount = n / P;
        int pcount = n % P;
        
        System.out.println(Tcount);
        System.out.println(Pcount + " " + pcount);
        sc.close();
    }
}
