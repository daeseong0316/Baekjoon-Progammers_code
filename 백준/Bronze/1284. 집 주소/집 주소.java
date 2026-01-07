import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        String input;
        while((input = br.readLine()) != null && !input.equals("0")) {
        	int sum = input.length() + 1;
        	for(int i=0;i<input.length();i++) {
        		if(input.charAt(i) == '1') {
        			sum += 2;
        		}
        		else if(input.charAt(i) == '0') {
        			sum += 4;
        		}
        		else {
        			sum += 3;
        		}
        	}
        	bw.write(String.valueOf(sum) + '\n');
        }
        
        bw.flush();
        bw.close();
    }
}
