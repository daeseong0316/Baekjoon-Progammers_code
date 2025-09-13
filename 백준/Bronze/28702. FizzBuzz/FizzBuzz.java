import java.util.*;

public class Main {
    public static String fizzbuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return String.valueOf(n);
    }

    public static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        int start = 1;
        if (isNumeric(n1)) {
            start = Integer.parseInt(n1);
        } else if (isNumeric(n2)) {
            start = Integer.parseInt(n2) - 1;
        } else if (isNumeric(n3)) {
            start = Integer.parseInt(n3) - 2;
        }

        for (int i = Math.max(1, start - 10); i <= start + 10; i++) {
            String r1 = fizzbuzz(i);
            String r2 = fizzbuzz(i + 1);
            String r3 = fizzbuzz(i + 2);

            if (r1.equals(n1) && r2.equals(n2) && r3.equals(n3)) {
                System.out.println(fizzbuzz(i + 3));
                break;
            }
        }

        sc.close();
    }
}
