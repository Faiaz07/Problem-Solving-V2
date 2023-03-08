
package Arrays;

public class MAXMIN {
    static class Pair{
        int max;
        int min;
    }

    static Pair getmaxmin(int arr[], int low, int high){
        Pair maxmin = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        int mid;

        if (low == high){
            maxmin.max= arr[low];
            maxmin.min= arr[low];

            return maxmin;
        }

        if (high == low+1){
            if (arr[low]>arr[high]) {
                maxmin.max = arr[low];
                maxmin.min = arr[high];
            }
            else {
                maxmin.max = arr[high];
                maxmin.min = arr[low];
            }

            return maxmin;
        }

        mid = (low+high)/2;

        mml = getmaxmin(arr, low, mid);
        mmr = getmaxmin(arr, mid+1,high);

        if (mml.max > mmr.max){
            maxmin.max = mml.max;
        }
        else {
            maxmin.max = mmr.max;
        }

        if (mml.min < mmr.min){
            maxmin.min = mml.min;
        }
        else {
            maxmin.min = mmr.min;
        }

        return maxmin;
    }


    public static void main(String[] args) {
        int arr[] = {7,9,2,6,18,4,1};
        int size = arr.length;
        Pair maxmin = getmaxmin(arr,0,size-1);

        System.out.println("Max value: "+maxmin.max);
        System.out.println("Min value: "+maxmin.min);

    }
}

