import java.io.*;
import java.util.*;
//import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n1 = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(n + n1));
        
        bw.flush();
        bw.close();
    }
}