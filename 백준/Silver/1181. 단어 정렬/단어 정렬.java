import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vector<String> str = new Vector<>(n);
        for(int i = 0; i < n; i++) {
            str.add(sc.next());
        }

        Set<String> uniqueWords = new HashSet<>(str);
        
        Vector<String> uniqueSortedWords = new Vector<>(uniqueWords);
        Collections.sort(uniqueSortedWords, new Comparator<String>(){
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });

        for (String word : uniqueSortedWords) {
            System.out.println(word);
        }

        sc.close();
    }
}