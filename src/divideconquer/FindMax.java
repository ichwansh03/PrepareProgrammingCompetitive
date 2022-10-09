package divideconquer;

public class FindMax {

    //complexity : O(N)
    static int findMax(int[] arr, int left, int right){
        if (left == right){
            return arr[left];
        }
        else {
            int mid = (left + right)/2;
            int leftmax = findMax(arr,left,mid);
            int rightmax = findMax(arr,mid+1,right);
            return Math.max(leftmax,rightmax);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,7,8,9,10,15,6};

        System.out.println(findMax(arr,0,arr.length-1));
    }
}
