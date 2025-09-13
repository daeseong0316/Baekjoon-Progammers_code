import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int[] man = new int[9];
        int sum = 0;
        final int size = 9;
        
        for(int i=0;i<size;i++) {
        	man[i] = sc.nextInt();
        	sum += man[i];
        }
        
        Arrays.sort(man);
        
        for(int i=0;i<size-1;i++) {
        	for(int j=i+1;j<size;j++) {
        		if(sum-(man[i]+man[j])==100) {
        			for(int k=0;k<size;k++) {
        				if(k != i && k != j) {
        					System.out.println(man[k]);
        				}
        			}
        			return;
        		}
        	}
        }
		
		sc.close();
	}

}
