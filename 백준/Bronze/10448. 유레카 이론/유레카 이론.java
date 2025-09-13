//Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int n = sc.nextInt();
			
		ArrayList<Integer> Tn = new ArrayList<>();
		for(int i=1;i*(i+1)/2<=1000;i++) {
			Tn.add(i*(i+1)/2);
		}
		
		for(int t=0;t<n;t++) {
			int num = sc.nextInt();
			boolean found = false;
			
			for(int i=0;i<Tn.size();i++) {
				for(int j=0;j<Tn.size();j++) {
					for(int k=0;k<Tn.size();k++) {
						if(Tn.get(i) + Tn.get(j) + Tn.get(k) == num) {
							found = true;
							break;
						}
					}
					if(found) break;
				}
				if(found) break;
			}
			
			if(found) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
    }
}