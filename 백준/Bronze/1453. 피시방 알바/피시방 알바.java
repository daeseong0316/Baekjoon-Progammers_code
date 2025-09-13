import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num, count = 0;
        int n = Integer.parseInt(br.readLine());

        Vector<Integer> pc = new Vector<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());

            if (pc.contains(num)) 
                count++;

            pc.add(num); 
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
