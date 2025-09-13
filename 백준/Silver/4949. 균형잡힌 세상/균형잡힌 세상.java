import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        String line;
        while(!(line = br.readLine()).equals(".")) {
        	Stack<Character> stack = new Stack<>();
        	boolean check = true;
        	for(int i=0;i<line.length();i++) {
        		char c = line.charAt(i);
        		
        		if(c == '(' || c == '[') {
        			stack.push(c);
        		}
        		else if(c == ')') {
        			if(stack.isEmpty() || stack.peek() != '(') {
        				check = false;
        				break;
        			}
        			else {
        				stack.pop();
        			}
        		}
        		else if(c == ']') {
        			if(stack.isEmpty() || stack.peek() != '[') {
        				check = false;
        				break;
        			}
        			else {
        				stack.pop();
        			}
        		}
        	}
        	if(!stack.isEmpty()) {
        		check = false;
        	}
        	
        	if(check) {
        		sb.append("yes\n");
        	}
        	else {
        		sb.append("no\n");
        	}
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}
