public class Main {
    static int factorial(int n){                               //######## ANOTHER APPROACH########
        int factorial=1;                                          //  int factorial=1;
        for(int i =0;i<n;i++) {                                   //   for(int i=n; i<0;i--){
            factorial = factorial * (n - i);                      //      factorial=factorial*i;
        }                                                         //    }
        return factorial;                                         //  return factorial;
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }
}