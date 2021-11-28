import java.util.Scanner;
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\nAddition = "+(a+b)+"\nMultiplication = "+(a*b)+"\nSubtraction = "+(a-b)+"\nDivision = "+(a/b)+"\nRemainder = "+(a%b));
    }
}
