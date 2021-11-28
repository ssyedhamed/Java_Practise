import java.util.Scanner;
// Write a Java program that takes two numbers as input and display the product of two numbers.
public class Program_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers to Multiply\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.err.println("The product is \n"+(a*b));
    }
}
