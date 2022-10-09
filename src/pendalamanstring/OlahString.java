package pendalamanstring;

import java.util.Scanner;

public class OlahString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teks = input.nextLine();

        for (int i = 0; i < teks.length(); i++) {
            char a = teks.charAt(i);
            a = 'a';
            System.out.println(a);
        }
    }
}
