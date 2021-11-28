
import java.util.Scanner;
// Write a Java program to divide two numbers and print on the screen
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to divide: \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Division = \n"+(a/b));
    }
}
