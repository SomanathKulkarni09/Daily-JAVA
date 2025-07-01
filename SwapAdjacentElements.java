import java.util.Arrays;

public class SwapAdjacentElements {
    
    public static void swap(int arr[]){

        for(int i = 1; i < arr.length; i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}