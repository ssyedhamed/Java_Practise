import java.util.Scanner;
// Write a Java program to print an American flag on the screen.
// Expected Output

// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================
 

public class Program_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth of flag : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();
        // start
        if(l%2==0&&b%2!=0){
            System.out.println("enter both as even or odd");
        }
        else if(l%2!=0&&b%2==0){
            System.out.println("enter both as even or odd");
        }
        else if(l%2==0&&b%2==0){
            for(int i=1;i<=b;i++){
                for(int j=1;j<=l;j++){
                        if(i<=b/2&&j<=l/2){
                            System.out.print(" * ");
                        }
                        else{
                            System.out.print(" = ");
                        }
                }
                System.out.println();
            }
        }
        else if(l%2!=0&&b%2!=0){
            for(int i=1;i<=b;i++){
                for(int j=1;j<=l;j++){
                        if(i<=b/2+1&&j<=l/2+1){
                            System.out.print(" * ");
                        }
                        else{
                            System.out.print(" = ");
                        }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("umdefined");
        }
        
    }
}
