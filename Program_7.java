import java.util.Scanner;
// Write a Java program that takes a number as input and prints its multiplication table upto 10
public class Program_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to print its table \n");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(+n+"*"+i+"="+(n*i));
        }
    }
}
