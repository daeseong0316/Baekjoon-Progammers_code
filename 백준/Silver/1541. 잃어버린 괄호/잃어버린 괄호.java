import java.io.*;
import java.util.*;

public class Main {
	public static int sum(String s) {	// -를 기준으로 구분 했을 때 앞부분을 모두 더한다
		String[] str = s.split("\\+");	// str을 +를 기준으로 나눈다
		int sum = 0;
		for(String i: str) {
			sum += Integer.parseInt(i);
		}
		return sum;
	}
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split("\\-");
        
        int result = 0;
        result += sum(str[0]);
        
        for(int i=1;i<str.length;i++) {
        	result -= sum(str[i]);
        }
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
