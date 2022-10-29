package rekursi;

public class RekursiFaktorial {

    static int faktorial (int x){
        if (x == 1)
            return 1;
        else
            return x * faktorial(x-1);
    }


    public static void main(String[] args) {

        int result = faktorial(4) / (faktorial(2) * faktorial(4-2));
        System.out.println(result);
    }
}
