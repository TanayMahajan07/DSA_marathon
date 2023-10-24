import java.util.Arrays;

public class Main {
     //  ***** METHOD 1 *****

//    static void reverse(int []arr){          //coping the elements of array into new array in reverse oreder.
//        int []arr2=new int[arr.length];
//        for(int i=0,j= arr.length-1; i< arr.length; i++,j--){
//            arr2[i]=arr[j];
//        }
//        System.out.println(Arrays.toString(arr2));
//
//    }
     // ***** METHOD 2 ***** ( Better Method)
    static void swap(int []arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse(int[]arr){  // 2 pointer (start and end ) Method.
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
   

      //  swap(arr);



    }
}