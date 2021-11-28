import java.util.Scanner;
// Write a Java program to print the sum of two numbers.
public class Program_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers to add:\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition is"+(a+b));
    }
}
