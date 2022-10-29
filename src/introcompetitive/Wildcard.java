package introcompetitive;

import java.util.Scanner;

public class Wildcard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();

        //find index of asterix sign
        int sign = text.indexOf('*');

        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            String in;
            boolean ispat = true;
            in = input.next();

            if (text.length() - 1 > in.length()){
                ispat = false;
            }
            else if (sign == 0){
                for (int j = 1; j < text.length(); j++) {
                    if (in.indexOf(in.length() - j) != text.indexOf(text.length() - j)){
                        ispat = false;
                        break;
                    }
                }
            } else if (sign == text.length() - 1){
                for (int j = 0; j < text.length() - 1; j++) {
                    if (in.indexOf(j) != text.indexOf(j)){
                        ispat = false;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < sign; j++) {
                    if (in.indexOf(j) != text.indexOf(j)){
                        ispat = false;
                        break;
                    }
                }
                for (int j = 1; j < text.length() - sign; j++) {
                    if (in.indexOf(j) != text.indexOf(j)){
                        ispat = false;
                        break;
                    }
                }
            }

            if (ispat)
                System.out.println(in);
        }
    }
}
