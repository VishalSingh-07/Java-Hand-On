import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int a;
        double b,c;
        Scanner scan=new Scanner(System.in);

        a=scan.nextInt();
        b=scan.nextDouble();
        c=scan.nextDouble();

        Account account=new Account(a,b,c);

        int noOfYears;
        noOfYears=scan.nextInt();

        double answer=calculateInterest(account, noOfYears);
        System.out.format("%.3f",answer);

    }

    public static double calculateInterest(Account a, int noOfYears)
    {
        double temp=noOfYears*a.getInterestRate()/100;
        return (a.getBalance()*(a.getInterestRate()+temp)/100);
    }
}

class Account
{
    private int id;
    private double balance;
    private double interestRate;

    Account(int id, double balance, double interestRate){
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }

}