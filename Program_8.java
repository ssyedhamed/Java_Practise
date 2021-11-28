import java.util.Scanner;
//  Write a Java program to display the following pattern. 

//    J    a   v     v  a                                                  
//    J   a a   v   v  a a                                                 
// J  J  aaaaa   V V  aaaaa                                                
//  JJ  a     a   V  a     a

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        System.out.println();
        if(n%2!=0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n/2+1||(i==n-1&&j==1)||(i==n&&j<=n/2+1)){
                        System.out.print("J");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    System.out.println();
                // FOR A
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n||j==1||i==n/2+1){
                        System.out.print("A");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    
    
            System.out.println();
            // FOr V
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==n||j==n||j==1){
                        System.out.print("V");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            // for a
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n||j==1||i==n/2+1){
                        System.out.print("A");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n/2||(i==n-1&&j==1)||(i==n&&j<=n/2)){
                        System.out.print("J");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    System.out.println();
                // FOR A
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n||j==1||i==n/2){
                        System.out.print("A");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    
    
            System.out.println();
            // FOr V
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==n||j==n||j==1){
                        System.out.print("V");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            // for a
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==n||j==1||i==n/2){
                        System.out.print("A");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}