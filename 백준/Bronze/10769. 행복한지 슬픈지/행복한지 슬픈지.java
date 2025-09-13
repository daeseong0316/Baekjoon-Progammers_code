import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String happy = ":-)";
        String sad = ":-(";
        
        String str = sc.nextLine();
        
        int ha = 0, sa = 0;

        // 3글자씩 슬라이딩 하면서 이모티콘 탐색
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals(happy)) {
                ha++;
            } else if (sub.equals(sad)) {
                sa++;
            }
        }

        if (ha == 0 && sa == 0) {
            System.out.println("none");
        } else if (ha == sa) {
            System.out.println("unsure");
        } else if (ha > sa) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
