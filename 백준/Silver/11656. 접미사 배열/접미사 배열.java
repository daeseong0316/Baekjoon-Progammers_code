import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();	// 단어
        
        String[] misa = new String[s.length()];	// 접미사를 저장할 공간
        
        for(int i=0;i<misa.length;i++) {
        	misa[i] = s.substring(i);
        }
        
        Arrays.sort(misa);
        
        for(int i=0;i<misa.length;i++) {
        	bw.write(misa[i] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
