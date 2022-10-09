package bruteforce;

public class KnapsackFruit {

    public static void main(String[] args) {
        String[] names = {"Apel","Jeruk","Nanas","Salak","Anggur"};
        int[] weights = {2,1,4,5,3};
        int[] profits = {8,9,6,3,5};

        int bestProfits = 0;
        for (int i = 0; i < weights.length; i++) {
            for (int j = i+1; j < profits.length; j++) {
                int weight = weights[i] + weights[j];
                int profit = profits[i] + profits[j];
                System.out.println(names[i] + " " + names[j] + " " + weight + " " + profit);
                if ((profit > bestProfits) && (weight<=weights.length)){
                    bestProfits = profit;
                }
            }
        }

        System.out.println("best profits = "+bestProfits);
    }
}
