import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ans;

        int n1;
        int n2;


        while (true){
            System.out.println("Enter operators- ");
            int opr=sc.next().trim().charAt(0);
            if(opr =='+' || opr =='-'|| opr=='*'|| opr=='/'){
                System.out.println("Enter two no.s- ");
                 n1=sc.nextInt();
                 n2=sc.nextInt();

                if (opr=='+'){
                System.out.println(n1+n2);
            }
                if (opr=='-'){
                System.out.println(n1-n2);
            }
                if (opr=='*'){
                System.out.println(n1*n2);
            }
                if (opr=='/'){
                System.out.println(n1/n2);
            }
            }
            else if (opr=='x' || opr =='X') {
                break;

            }
            else {
                System.out.println("Wrong input");
            }
        }

    }
}