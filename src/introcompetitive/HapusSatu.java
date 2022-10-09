package introcompetitive;

import java.util.Scanner;

public class HapusSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        String a,b;

        a = input.nextLine();
        b = input.nextLine();

        if (a.length() == b.length()+1){
            for (int i = 0; i <= a.length(); i++) {
                if (a.length() == i){
                    System.out.println("Tentu saja bisa!");
                }
                if (count == i-2){
                    System.out.println("Wah, tidak bisa :(");
                    break;
                }
                if (a.indexOf(i) == b.indexOf(count)){
                    count++;
                }
            }
        }
        else
            System.out.println("Wah, tidak bisa :(");
    }
}
