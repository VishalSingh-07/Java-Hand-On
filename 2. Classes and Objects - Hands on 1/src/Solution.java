import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int y1=scan.nextInt();
        int x2=scan.nextInt();
        int y2=scan.nextInt();

        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);

        double result=findDistance(p1, p2);
        System.out.format("%.3f",+result);
    }

    public static double findDistance(Point p1, Point p2)
    {
        double x2=p2.getX(),x1=p1.getX();
        double y2=p2.getY(),y1=p1.getY();
        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }
}

class Point
{
    private int x;
    private int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}