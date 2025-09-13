import java.io.*;
import java.util.*;

public class Main {
	static int Rcount;
	
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	return 0;
        }
        else {
        	Rcount++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++) {
        	String str = br.readLine();
        	
        	Rcount = 1;
        	
        	System.out.print(isPalindrome(str) + " ");
        	System.out.println(Rcount);
        }
        
        
        bw.flush();
        bw.close();
    }
}
