package bruteforce;

public class SubsetSum {

    static boolean solve(int[] set, int sum, int n){

        //base case
        if (sum == 0)
            return true;

        if (n == 0 && sum != 0)
            return false;

        //if last element is greater than sum, then ignore it
        if (set[n-1] > sum)
            return solve(set, sum, n-1);

        //else, check if sum can be obtained by any of the following
        //-including the last element
        //-excluding the last element

        return solve(set, sum, n-1) || solve(set, sum - set[n-1], n-1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,8,9,10,5};
        System.out.println(solve(arr,6,arr.length));
    }
}
