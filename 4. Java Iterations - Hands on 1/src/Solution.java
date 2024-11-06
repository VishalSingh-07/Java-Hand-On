import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        int minValue=Integer.MAX_VALUE;
        String inputString=scan.nextLine();

        for(int i=0;i<inputString.length();i++){
            minValue=Math.min(minValue,(int)inputString.charAt(i));
        }
        char c=(char)minValue;
        System.out.println(c);
    }
}