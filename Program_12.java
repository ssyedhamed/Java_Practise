import java.util.Scanner;
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
public class Program_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter three numbers to get average:\n");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double avg=(a+b+c)/3;
        System.out.println("avg is :  "+avg);
    }
}
