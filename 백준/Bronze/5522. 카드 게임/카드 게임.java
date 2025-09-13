import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int[] card = new int[5];
        int sum = 0;
        
        for(int i=0;i<5;i++) {
            card[i] = sc.nextInt();
            sum += card[i]; 
        }
        System.out.println(sum);
        
        // Scanner를 닫지 않고 프로그램을 종료하지 않도록 주석 처리
        // sc.close();
    }
}
