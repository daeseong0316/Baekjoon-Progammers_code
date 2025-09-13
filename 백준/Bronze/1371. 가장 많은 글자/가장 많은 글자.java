import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        int i;
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            for (i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch != ' ') {
                    arr[ch - 'a']++;
                }
            }
        }
        
        scanner.close();
        
        int maxValue = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == maxValue) {
                System.out.print((char)(i + 'a'));
            }
        }
    }
}
