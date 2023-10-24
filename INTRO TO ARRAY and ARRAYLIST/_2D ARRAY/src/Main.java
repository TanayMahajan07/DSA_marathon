import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int[][] arr =new int[3][3];
         //TAKING INPUT IN 2D ARRAY-
         for (int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                 arr[i][j]=sc.nextInt();
             }
         }

         //TO PRINT 2D ARRAY-
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }

        // USING FOREACH LOOP-
//        for (int []x:arr){
//                 for (int y: x){
//                     System.out.print(y+" ");
//                 }
//            System.out.println();
//        }

        // USING MORE SIMPLE WAY-
        for (int x[]:arr){
            System.out.println(Arrays.toString(x));
        }

}}