package pendalamanstring;

import java.util.Scanner;

public class CaesarChiper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] buff = new char[110];
        buff = input.next().toCharArray();
        int N = input.nextInt();

        int len = buff.length;
        for (int i = 0; i < len; i++) {
            int ord = (buff[i] - 'a');
            int encrypt = (ord + N) % 26;
            buff[i] = (char) (encrypt + 'a');
        }

        System.out.println(buff);
    }
}







