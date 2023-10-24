import java.util.Scanner;

public class Main {
    static int max(int a , int b, int c){
        int max ;
        max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    static  int min(int a, int b, int c){
        int min;
        min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }


    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  3 no's -");
         int a= sc.nextInt();
         int b= sc.nextInt();
         int c= sc.nextInt();

        System.out.println("maximum no.:"+max(a,b,c));
        System.out.println("mininmum no.:"+min(a,b,c));





    }
}