// Java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scenario = 1;

        while (true) {
            int o = sc.nextInt(); // 적정 체중
            int w = sc.nextInt(); // 실제 체중

            if (o == 0 && w == 0) break; // 종료 조건

            boolean alive = true;

            while (true) {
                String action = sc.next();
                int n = sc.nextInt();

                if (action.equals("#") && n == 0) break; // 시나리오 종료

                if (!alive) continue; // 죽었으면 이후 행동 무시

                if (action.equals("E")) {
                    w -= n;
                } else if (action.equals("F")) {
                    w += n;
                }

                if (w <= 0) {
                    alive = false;
                }
            }

            if (!alive) {
                System.out.println(scenario + " RIP");
            } else if (w > o / 2 && w < o * 2) {
                System.out.println(scenario + " :-)");
            } else {
                System.out.println(scenario + " :-(");
            }

            scenario++;
        }
	}
}