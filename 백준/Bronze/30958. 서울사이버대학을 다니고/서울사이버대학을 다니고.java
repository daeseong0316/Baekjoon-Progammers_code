import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        int[] arr = new int[26];
        for(int i=0;i<n;i++) {
        	char ch = str.charAt(i);
        	
        	if (ch >= 'a' && ch <= 'z') { 
                arr[ch - 'a']++;
            }
        }
        
        int max = arr[0];
        for(int count: arr) {
        	if(max < count) {
        		max = count;
        	}
        }
        
        System.out.println(max);
        
        sc.close();
    }
}
