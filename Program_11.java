import java.lang.Math;
// Write a Java program to print the area and perimeter of a circle.
public class Program_11 {
    public static void main(String[] args) {
        final double PIE=3.14;
        int r=5;
        double area=PIE*Math.pow(r,2);
        double peri=2*PIE*r;
        System.out.println("area and perimeter of circle is\n"+(area)+"     "+peri);
    }
}
