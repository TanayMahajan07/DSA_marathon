public class Main {
    static boolean isPrime(int n) {
        if (n==2){      // Since 2 is a prime no.
            return true;
        }
        for (int i=2;i<=n/2;i++){
             if (n%i==0){       //not a prime no.
                 return false ;
             }


        }
        return true;

    }
    public static void main(String[] args) {

        System.out.println(isPrime(2));


    }
}