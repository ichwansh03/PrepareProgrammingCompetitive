#include <iostream>
using namespace std;

void selectionSort(int h[], int N) {
    for (int i = 0; i < N; i++) {
        // Pencarian indeks terkecil
        int minIndex = i;
        for (int j = i + 1; j < N; j++) {
            if (h[j] < h[minIndex]) {
                minIndex = j;
            }
        }
        // Tukar h[i] dengan h[minIndex]
        int temp = h[i];
        h[i] = h[minIndex];
        h[minIndex] = temp;
    }
}

int main() {
    int h[] = {5, 3, 8, 4, 2};
    int N = sizeof(h) / sizeof(int);
    
    cout << "Array sebelum diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    selectionSort(h, N);
    
    cout << "Array setelah diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    return 0;
}

