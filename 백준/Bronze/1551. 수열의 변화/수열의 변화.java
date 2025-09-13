import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        String[] n2 = sc.next().split(",");
        for(int i=0;i<n;i++) {
        	list.add(Integer.parseInt(n2[i]));
        }
        
        for(int i=0;i<num;i++) {
        	List<Integer> list2 = new ArrayList<>();
        	for(int j=0;j<list.size()-1;j++) {
	        	int number = list.get(j+1) - list.get(j);
	        	list2.add(number);
        	}
        	list = list2;
        }
        
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i));
        	if(i < list.size()-1) {
        		System.out.print(",");
        	}
        }
    }
}
