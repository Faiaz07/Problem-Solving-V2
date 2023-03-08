package Arrays;

public class ReverseArrayRecursion {
    static void reverseArray(int arr[], int start, int end){
        int temp;
        if(start>end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end-1);
    }

    static void printArray(int arr[], int size){
        for (int i=0; i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {10,20,30,40};

        reverseArray(arr,0,arr.length-1);
        printArray(arr,arr.length);
    }

}
