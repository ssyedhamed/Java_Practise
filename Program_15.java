import java.util.Scanner;
// Write a Java program to swap two variables
public class Program_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x = ");
        int x=sc.nextInt();
        System.out.println("enter y = ");
        int y=sc.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("swapped x and y\nNow x = "+x+ " and y = "+y);
    }
}
