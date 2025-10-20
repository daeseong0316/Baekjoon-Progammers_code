import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = 300;
        int b = 60;
        int c = 10;
        
        int num = Integer.parseInt(br.readLine());
        
        if(num % 10 != 0) {
        	bw.write("-1");
        }
        else {
        	int acount = 0, bcount = 0, ccount = 0;
        	while(num != 0) {
        		if(num >= a) {
        			num -= a;
        			acount++;
        		}
        		else if(num >= b){
        			num -= b;
        			bcount++;
        		}
        		else {
        			num -= c;
        			ccount++;
        		}
        	}
        	bw.write(acount + " " + bcount + " " + ccount);
        }
        
        bw.flush();
        bw.close();
    }
}
