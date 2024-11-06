import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=scan.nextInt();
        // }
        // int largest=Integer.MIN_VALUE;
        // int secondLargest=Integer.MIN_VALUE;

        // for(int i=0;i<n;i++){
        //     if(checkPrime(arr[i])==true){
        //         if(arr[i]>largest){
        //             secondLargest=largest;
        //             largest=arr[i];
        //         }
        //         else if(arr[i]>secondLargest  && arr[i]<largest){
        //             secondLargest=arr[i];
        //         }
        //     }
        // }
        // System.out.println(secondLargest);

        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=scan.nextInt();
            if(checkPrime(num)){
                primes.add(num);
            }
        }
        Collections.sort(primes);
        System.out.println(primes.get(primes.size()-2));
    }
    public static boolean checkPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}