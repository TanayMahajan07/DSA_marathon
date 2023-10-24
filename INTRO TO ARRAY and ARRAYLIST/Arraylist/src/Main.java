import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> list=new ArrayList<>(5);

//         list.add(1);
//        list.add(1); list.add(1);
//        list.add(1); list.add(1);
//        list.add(1); list.add(1);
//        System.out.println(list);
//
//        list.set(0,2);
//        System.out.println(list);
//
        //  #####  MULTIDIMENSIONAL ARRAYLIST  ##########

        ArrayList<ArrayList<Integer>> list =new ArrayList<>(5);
        Scanner sc =new Scanner(System.in);

        //initialisation:

        for(int i=0 ; i<3;i++){
            list.add(new ArrayList<>());
        }
        // Adding elements :
        for (int i=0 ; i<3; i++){
            for (int j=0; j<3;i++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);


    }
}