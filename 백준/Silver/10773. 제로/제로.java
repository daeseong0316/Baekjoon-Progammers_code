import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        Stack<Integer> number = new Stack<>();
        
        for(int i=0;i<k;i++) {
        	int num = sc.nextInt();
        	
        	if(num == 0) {
        		number.pop();
        	}
        	else {
        		number.push(num);
        	}
        }
        
        int sum = 0;
        while(!number.empty()) {
        	sum += number.peek();
        	number.pop();
        }
        System.out.println(sum);

        sc.close();
    }
}