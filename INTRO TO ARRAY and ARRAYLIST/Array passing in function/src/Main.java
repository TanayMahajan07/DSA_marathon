import java.util.Scanner;

public class Main {
    //static int o;
   //static int n;
    static  void changeArray(int arr[],int o,int n){

        arr[o]=n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
           int arr[] ={1,2,3,45,6};
           changeArray(arr,3,4);
           for(int x:arr){
               System.out.println(x);

           }
    }
}