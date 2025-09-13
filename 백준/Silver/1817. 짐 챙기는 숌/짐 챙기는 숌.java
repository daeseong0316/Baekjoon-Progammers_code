import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int n, m;	// n = 책의 개수, m = 박스 최대 무게
        n = sc.nextInt();
        m = sc.nextInt();
        
        if(n <= 0) {
        	System.out.println("0");
        	return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
		
        for(int i=0;i<n;i++) {
        	int weight = sc.nextInt();
        	arr.add(weight);
        }
        
        int count = 0;
        int current_weight = 0;
        for(int i=0;i<n;i++) {
        	current_weight += arr.get(i);
        	if(current_weight > m) {
        		count++;
        		current_weight = arr.get(i);
        	}
        }
        count++;
        
        System.out.println(count);
        
		sc.close();
	}

}