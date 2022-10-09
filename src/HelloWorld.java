import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            int fak = 0;
            for (int j = 1; j <= x; j++) {
                if (fak > 4){
                    break;
                }
                if (x % j == 0){
                    fak++;
                }
            }

            if (fak <= 4)
                System.out.println("YA");
            else
                System.out.println("BUKAN");
        }
    }
}
