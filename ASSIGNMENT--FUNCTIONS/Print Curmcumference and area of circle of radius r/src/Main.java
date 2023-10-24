import java.util.Scanner;

public class Main {
    static double curcumference(int r){
        return 2*Math.PI*r;
    }
    static double area(int r) {
        return  Math.PI * r * r;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius r :");
        int radius=sc.nextInt();
        System.out.println("Circumference :"+ curcumference(radius));
        System.out.println("Area :"+area(radius));

    }
}