import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = "";
        
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	String pw = sc.next();
        	String repw = new StringBuilder(pw).reverse().toString();
            
            if(map.containsKey(repw) || pw.equals(repw)) {
            	result = pw;
    			break;
            }
            map.put(pw, repw);
        }
        
        if (!result.isEmpty()) {
            int index = result.length() / 2;
            System.out.println(result.length() + " " + result.charAt(index));
        }
    }
}
