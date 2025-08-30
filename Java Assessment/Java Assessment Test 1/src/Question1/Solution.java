package Question1;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=scan.nextInt();
        }
        int limit1=scan.nextInt();
        int limit2=scan.nextInt();
        int values=0,count=0;
        for(int i=0;i<5;i++){
            if(arr[i]>limit1 && arr[i]<limit2){
                values+=arr[i];
                count++;
            }
        }
        System.out.println(values / count);
    }
}