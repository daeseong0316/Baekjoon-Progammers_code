import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();
        
        BigInteger n1_bin = new BigInteger(n1, 2);
        BigInteger n2_bin = new BigInteger(n2, 2);
        
        BigInteger sum = n1_bin.add(n2_bin);
        
        String sum_bin = sum.toString(2);
        
        System.out.println(sum_bin);
        
        
        sc.close();
    }
}