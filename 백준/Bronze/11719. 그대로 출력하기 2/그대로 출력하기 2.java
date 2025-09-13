import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        StringBuilder sb = new StringBuilder();
        while((str = br.readLine()) != null) {
        	sb.setLength(0);
        	sb.append(str);
        	bw.write(sb.toString() + "\n");
        	bw.flush();
        }
        
        bw.close();
    }
}
