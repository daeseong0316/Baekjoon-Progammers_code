import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        double s25Y = Double.parseDouble(st.nextToken());
        double s25X = Double.parseDouble(st.nextToken());
        double result = (1000/s25X)*s25Y; 
        
        int num = Integer.parseInt(br.readLine());
        
        double nY, nX;
        for(int i=0;i<num;i++) {
        	st = new StringTokenizer(br.readLine());
        	nY = Double.parseDouble(st.nextToken());
        	nX = Double.parseDouble(st.nextToken());
        	double imsi = (1000/nX)*nY;
        	
        	result = Math.min(result, imsi);
        }
        
        System.out.println(String.format("%.2f", result));
        
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
