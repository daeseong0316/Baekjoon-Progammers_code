import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {	// 학생의 생일에 따라 정렬하는 객체
	String name;	// 이름
	int y, m, d;	// 생년월일
	
	public Student(String name, int d, int m, int y) {	// 이름, 생년월일을 받음
		this.name = name;
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int compareTo(Student other) { 	// 정렬 기준
		// 음수이면 this가 앞에, 양수이면 other이 앞에, 0이면 같음
		if(this.y != other.y) {		
			return this.y - other.y;
		}
		if(this.m != other.m) {
			return this.m - other.m;
		}
		return this.d - other.d;
	}
}
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 학생 수
        List<Student> list = new ArrayList<>();		// 정렬에 사용할 list 객체
        
        for(int i=0;i<n;i++) {
        	String[] input = br.readLine().split(" ");
            String name = input[0];					// 이름
            int dd = Integer.parseInt(input[1]);	// 일
            int mm = Integer.parseInt(input[2]);	// 월
            int yy = Integer.parseInt(input[3]);	// 년
        	list.add(new Student(name,dd,mm,yy));	// list에 넣기
        }
        
        Collections.sort(list);	// list 정렬
        
        bw.write(list.get(n-1).name + "\n");	// 생일이 가장 어린 사람
        bw.write(list.get(0).name);				// 생일이 가장 빠른 사람
        
        bw.flush();
        bw.close();
    }
}
