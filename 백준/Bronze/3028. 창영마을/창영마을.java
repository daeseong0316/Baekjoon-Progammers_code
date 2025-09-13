// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("0","1","2"));
        
        for(int i=0;i<str.length();i++) {
        	char c = str.charAt(i);
        	switch(c) {
        	case 'A':
        		Collections.swap(list, 0, 1);
        		break;
        	case 'B':
        		Collections.swap(list, 1, 2);
        		break;
        	case 'C':
        		Collections.swap(list, 0, 2);
        		break;
        	}
        }
        System.out.println(list.indexOf("0")+1);
    }
}