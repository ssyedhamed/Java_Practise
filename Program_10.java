import java.util.Scanner;
import java.lang.Math;
import java.lang.*;

// Write a Java program to compute a specified formula
// -b+rootb-4ac/2a
public class Program_10 {
    public static void main(String[] args) {
        System.out.println("enter a b c");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double x=sc.nextInt();
        double b=x*x;
        double c=sc.nextInt();
        System.out.println("Roots are: \n"+((-b+(sqrt((b*b)))-4*a*c))/(2*a));
    }
}
