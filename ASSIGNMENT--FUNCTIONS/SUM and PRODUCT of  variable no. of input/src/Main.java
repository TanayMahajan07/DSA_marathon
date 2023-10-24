public class Main {

    static int sum(int...n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        return sum;
    }
    static int product(int...n){
        int product=1;
        for (int i=0;i<n.length;i++){
            product=product*n[i];
        }
        return product;
    }


    public static void main(String[] args)
    {
        System.out.println("SUM :"+sum(1,2,3,445,5));
        System.out.println("PRODUCT :"+product(1,2,3,4,5,6,7));
    }
}