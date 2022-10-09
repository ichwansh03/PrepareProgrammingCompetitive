package greedy.activity_selection_problem;

import java.util.Arrays;
import java.util.Comparator;

//class to define user defined comparator
public class Compare {

    //utility fun that is used for sorting activities according to end time
    static void compare(Activity arr[], int n){
        Arrays.sort(arr, (o1, o2) -> o1.end - o2.end);
    }
}
