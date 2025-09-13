import java.io.*;
import java.util.*;

public class Main { 
    public static boolean Anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");

            if (Anagram(str[0], str[1])) {
                System.out.println(str[0] + " & " + str[1] + " are anagrams.");
            } else {
                System.out.println(str[0] + " & " + str[1] + " are NOT anagrams.");
            }
        }
    }
}
