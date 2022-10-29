package search_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PertemuanPakDengklek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String nama = in.next();
            list.add(nama);
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() == o2.length()){
                return o1.compareTo(o2);
            }

            return Integer.compare(o1.length(), o2.length());
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
