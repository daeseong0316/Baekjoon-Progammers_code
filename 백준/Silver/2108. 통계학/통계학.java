import java.util.*;
import java.io.*;

public class Main {
	public static int mod(List<Integer> list) {
		int sum = 0, result = 0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
		}
		return Math.round((float) sum / list.size()); 
	}
	public static int mid(List<Integer> list) {
		int midlen = list.size();
		Collections.sort(list);
		return list.get(midlen / 2);
	}
	public static int mode​Which(List<Integer> list) {
		Map<Integer,Integer> map = new HashMap<>(); 
		for(int i=0;i<list.size();i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
		}
		
		int max = Collections.max(map.values());
		
		List<Integer> list2 = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				list2.add(entry.getKey());
			}
		}
		
		Collections.sort(list2);
		
		if(list2.size() > 1) {
			return list2.get(1);
		}
		else {
			return list2.get(0);
		}
	}
	public static int range(List<Integer> list) {
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		return max - min;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	list.add(sc.nextInt());
        }
        
        System.out.println(mod(list));
        System.out.println(mid(list));
        System.out.println(mode​Which(list));
        System.out.println(range(list));
    }
}
