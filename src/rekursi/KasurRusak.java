package rekursi;

import java.util.Scanner;

public class KasurRusak {

    static boolean palindrome(String x, int i){
        if (x.length()/2 > i){
            if (x.charAt(i) != x.charAt(x.length()-i-1)){
                return false;
            } else {
                return palindrome(x, i+1);
            }
        } else {
            return true;
        }
    }

    static void isPalindrome(String value){
        if (palindrome(value, 0)){
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teks = input.nextLine();

        isPalindrome(teks);
    }
}
