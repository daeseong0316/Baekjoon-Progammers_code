import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int snack, number, Mmoney, money = 0, result = 0;
        snack = sc.nextInt();
        number = sc.nextInt();
        Mmoney = sc.nextInt();
    
        money = (snack * number);
        result = money - Mmoney;
    
        if(money < Mmoney) {
            System.out.print(0);
        }
        else{
            System.out.print(result);
        }
        
        sc.close();
    }
}