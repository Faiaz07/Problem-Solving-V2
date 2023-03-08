package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {4,5,1,2};
        int rev[] = new int[arr.length];
        int ind = arr.length - 1;

        for(int i =0; i<= ind;i++){
            rev[ind-i] = arr[i];
        }

        for(int i =0; i<=ind;i++){
            System.out.print(rev[i]+" ");
        }

    }
}
