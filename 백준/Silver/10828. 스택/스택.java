import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    static LinkedList<Integer> stack = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];

            if (name.equals("push")) {
                int x = Integer.parseInt(input[1]);
                stack.push(x);
            } else if (name.equals("pop")) {
                if (stack.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(stack.pop()).append("\n");
            } else if (name.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (name.equals("empty")) {
                if (stack.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (name.equals("top")) {
                if (stack.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(stack.peek()).append("\n");
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
