package datastructure;

public class DynamicArray {
//di java dapat menggunakan ArrayList
    static int size = 0;
    static int maxSize = 3;
    static int[] A = new int[maxSize];

    static void push(int item){
        if (A.length == size){
            //creating a new array double the size of array declared above
            int[] arr = new int[2 * size];

            //iterating over new array using for loop
            for (int i = 0; i < size; i++) {
                arr[i] = A[i];
            }

            //assign new array to original array created above
            A = arr;
        }

        A[size++] = item;
    }

    static void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        print();
    }
}
