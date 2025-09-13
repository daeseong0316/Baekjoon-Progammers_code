import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int fixed = Integer.parseInt(st.nextToken());		// 고정
        int variable = Integer.parseInt(st.nextToken());	// 가변
        int notebook = Integer.parseInt(st.nextToken());	// 노트북 가격
        
        if(variable >= notebook) {
        	System.out.println("-1");
        }
        else {
        	int iick = notebook - variable;
        	int result = (fixed/iick)+1;
        	System.out.println(result);
        }
        
        bw.flush();
        bw.close();
    }
}
