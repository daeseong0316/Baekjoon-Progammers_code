import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();		// 문자 입력
        ArrayList<String> arr = new ArrayList<>();	// 사전 순으로 가장 빠른 단어를 넣을 공간
        
        // 3개의 부분으로 나누기 위해 2곳의 절단 부분 정하기
        for(int i=1;i<str.length()-1;i++) {		// 최소 1글자 이상이기 때문에 1부터 시작한다.(자르는 위치가 0번째가 되면 안 된다.)
        	for(int j=i+1;j<str.length();j++) {
        		
        		// 3부분으로 절단
        		String p1 = str.substring(0,i);	
        		String p2 = str.substring(i,j);
        		String p3 = str.substring(j);
        		
        		// 자른 부분 뒤집기
        		StringBuilder sb = new StringBuilder();
        		sb.append(new StringBuilder(p1).reverse());
        		sb.append(new StringBuilder(p2).reverse());
        		sb.append(new StringBuilder(p3).reverse());
        		
        		arr.add(sb.toString());	// 생성 된 단어 넣기
        	}
        }
        
        Collections.sort(arr);	// 사전 순으로 빠르게 정렬
        System.out.println(arr.get(0));	// 0번째 단어 출력(sort를 사용하여 0번째에 가장 빠른 단어가 있다)
        
        bw.flush();
        bw.close();
    }
}
