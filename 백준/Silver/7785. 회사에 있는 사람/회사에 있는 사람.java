import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");
        	String name = str[0];
        	String record = str[1];
        	
        	map.put(name, record);
        }
        
        List<String> list = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("leave")) {
                iterator.remove();
            } else {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);
        
        for(int i=list.size()-1;i>=0;i--) {
        	bw.write(list.get(i) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
