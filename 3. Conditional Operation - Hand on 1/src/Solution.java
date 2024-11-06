import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();
        double x3=scan.nextDouble();
        double y3=scan.nextDouble();
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        Point p3=new Point(x3,y3);

        Point result=pointWithHighestOriginDistance(p1, p2, p3);

        System.out.println(result.x);
        System.out.println(result.y);

    }
    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3){
        double distance1=Math.sqrt((p1.x-0)*(p1.x-0)+(p1.y-0)*(p1.y-0));
        double distance2=Math.sqrt((p2.x-0)*(p2.x-0)+(p2.y-0)*(p2.y-0));
        double distance3=Math.sqrt((p3.x-0)*(p3.x-0)+(p3.y-0)*(p3.y-0));

        if(distance1>=distance2 && distance1>=distance3){
            return p1;
        }
        else if(distance2>=distance1 && distance2>=distance3){
            return p2;
        }
        return p3;
    }
}

class Point
{
    double x;
    double y;
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }

}