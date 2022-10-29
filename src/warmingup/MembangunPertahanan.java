package warmingup;

import java.util.Scanner;

//https://tlx.toki.id/problems/osn-2022/1A
public class MembangunPertahanan {

    static long N, Q, x;
    static long left, right, tleft, tright;
    static long a, b, res;

    static long position(long item){
        if (item <= (N + 1)/2)
            return 2 * item - 1;
        else
            return 2 * (1 + N - item);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextLong();
        Q = input.nextLong();

        for (int i = 1; i <= Q; i++) {
            x = input.nextLong();
            a = x % (N+1);
            b = x % (N+2);
            left = position(a);
            right = position(b);
            tleft = x/(N+1);
            tright = x/(N+2);

            if (x > N * (N + 1)/2){
                res = 0;
            } else if (a == 0){
                res = N/2-x / (N+1)+1;
            } else if (b == 0){
                res = (N - 1)/2 - x/(N+2)+1;
            } else {
                if (left % 2 == 1 && left - 2 * tleft > 0)
                    res++;
                if (right % 2 == 0 && right - 2 * tright > 0)
                    res++;
            }

            System.out.println(res);
        }
    }
}
