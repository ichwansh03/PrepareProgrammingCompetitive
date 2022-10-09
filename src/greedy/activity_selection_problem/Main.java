package greedy.activity_selection_problem;

public class Main {

    //returns count of max set of activities that can be done by a single person, one at a time
    static void printMaxActivities(Activity arr[], int n){
        //sort jobs according to end time
        Compare.compare(arr, n);
        System.out.println("follow activities are selected: ");

        //the first activity always gets selected
        int i = 0;
        System.out.print("("+arr[i].start+","+arr[i].end+"), ");

        //consider rest of the activities
        /*if this activity has start time greater than or equal
        * to end time of previously selected activity, then select it*/
        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].end){
                System.out.print("("+arr[j].start+","+arr[j].end+"), ");
                i=j;
            }
        }

    }

    public static void main(String[] args) {
        int n = 8;
        Activity[] arr = new Activity[n];
        arr[0] = new Activity(1,7);
        arr[1] = new Activity(2,6);
        arr[2] = new Activity(5,7);
        arr[3] = new Activity(6,9);
        arr[4] = new Activity(9,12);
        arr[5] = new Activity(10,12);
        arr[6] = new Activity(11,15);
        arr[7] = new Activity(13,14);

        printMaxActivities(arr, n);
    }
}
