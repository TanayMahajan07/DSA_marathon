import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter operator-");
            char opr= sc.next().charAt(0);
            if(opr=='+'|| opr=='-'|| opr=='*'|| opr=='/'){
                System.out.println("enter no's-");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                switch (opr){
                    case '+' :
                        System.out.println(n1+n2);
                        break;
                    case '-':
                        System.out.println(n1-n2);
                        break;
                    case '*':
                        System.out.println((n1*n2));
                        break;
                    case'/':
                        System.out.println(n1/n2);
                        break;
                    default:
                        System.out.println("Invalid input");

                }
            }
            else if (opr=='x') {
                break;

            }
            else System.out.println("wrong opertor");
        }
    }
}