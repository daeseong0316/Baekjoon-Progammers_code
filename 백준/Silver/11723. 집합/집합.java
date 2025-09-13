import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());
        
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<m;i++) {
        	String[] str = br.readLine().split(" ");
        	String cmd = str[0];
        	int n = 0;
        	if(str.length == 2) {
        		n = Integer.parseInt(str[1]);
        	}
        	switch(cmd) {
        	case "add":
        		s.add(n);
        		break;
        	case "remove":
        		s.remove(n);
        		break;
        	case "check":
        		if(s.contains(n)) {
        			bw.write("1\n");
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "toggle":
        		if(s.contains(n)) {
        			s.remove(n);
        		}
        		else {
        			s.add(n);
        		}
        		break;
        	case "all":
        		s.clear();
        		for(int j=1;j<=20;j++) {
        			s.add(j);
        		}
        		break;
        	case "empty":
        		s.clear();
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
