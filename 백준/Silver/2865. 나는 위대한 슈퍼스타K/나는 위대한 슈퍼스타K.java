import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<Integer, Float> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                float score = Float.parseFloat(st.nextToken());
                map.put(num, Math.max(map.getOrDefault(num, 0f), score));
            }
        }

        List<Float> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        int limit = Math.min(k, list.size());

        float sum = 0f;
        for (int i = 0; i < limit; i++) {
            sum += list.get(i);
        }

        bw.write(String.format("%.1f\n", sum));
        bw.flush();
        bw.close();
    }
}
