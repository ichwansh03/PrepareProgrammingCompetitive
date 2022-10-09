package pendalamanstring;

import java.util.Scanner;

public class BuangString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String S = input.nextLine();
        input.close();

        String[] T = S.split(" ");
        while (T[0].contains(T[1])){
            T[0] = T[0].replaceAll(T[1],"");
        }

        System.out.println(T[0]);
    }
}






