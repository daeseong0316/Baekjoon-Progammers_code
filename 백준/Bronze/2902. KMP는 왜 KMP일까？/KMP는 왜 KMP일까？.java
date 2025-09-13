// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] name = sc.next().split("-");
        int len = name.length;
        
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<len;i++) {
        	list.add(name[i].charAt(0));
        }
        
        for(char c: list) {
        	System.out.print(c);
        }
    }
}