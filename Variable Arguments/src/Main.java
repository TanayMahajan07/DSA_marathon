public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

    }
    static int sum(int ...n){
        int sum =0;
        for (int i=0; i<n.length;i++){

            sum=sum+n[i]  ;
        }
        return sum;
    }
}