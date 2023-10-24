public class Main {
    static int max(int arr[] ){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [ ] arr= {100,2,3,4,55,6,7,8,101};
        System.out.println(max(arr));

    }
}