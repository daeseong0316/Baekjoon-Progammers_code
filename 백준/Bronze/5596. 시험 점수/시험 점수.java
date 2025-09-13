import java.io. *;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	String mingukScores = sc.nextLine();
        String[] mingukArray = mingukScores.split(" ");
        
        String manseScores = sc.nextLine();
        String[] manseArray = manseScores.split(" ");
        
        int mingukTotal = 0;
        int manseTotal = 0;
        
        for (int i = 0; i < mingukArray.length; i++) {
            mingukTotal += Integer.parseInt(mingukArray[i]);
            manseTotal += Integer.parseInt(manseArray[i]);
        }
        
        if (mingukTotal >= manseTotal) {
            System.out.println(mingukTotal);
        } else {
            System.out.println(manseTotal);
        }
    	
    	sc.close();
    	}
}
/*
100 80 70 60
80 70 80 90
*/