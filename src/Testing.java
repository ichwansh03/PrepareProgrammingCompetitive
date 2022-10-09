import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Second to Hour");
        System.out.println("2. Minutes to Second");

        int n = input.nextInt();

        if (n == 1){

            System.out.println("input value of second = ");
            int hour = input.nextInt();
            System.out.println(hour+" second = "+ (hour/3600) + " hour");

        } else if (n == 2){

            System.out.println("input value of second = ");
            int min = input.nextInt();
            System.out.println(n + " second = "+ (min/60) + " minutes");

        } else {
            System.out.println("input not available");
        }
    }
}
