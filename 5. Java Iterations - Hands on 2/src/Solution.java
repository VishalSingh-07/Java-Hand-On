import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num=scan.nextInt();
            String fact=factorial(num);
            System.out.println(fact);
        }
    }
    public static String factorial(int num){
        BigInteger fact=new BigInteger("1");
        for(int i=1;i<=num;i++){
            fact=fact.multiply(new BigInteger(i+""));
        }
        return fact.toString();
    }
}


