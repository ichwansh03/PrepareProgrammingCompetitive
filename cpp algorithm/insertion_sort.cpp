#include <iostream>
using namespace std;

void insertionSort(int h[], int N) {
    for (int i = 1; i < N; i++) {
        int pos = i;
        while (pos > 0 && h[pos] < h[pos - 1]) {
            // Tukar h[pos] dengan h[pos-1]
            int temp = h[pos];
            h[pos] = h[pos - 1];
            h[pos - 1] = temp;
            pos--;
        }
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
    
    insertionSort(h, N);
    
    cout << "Array setelah diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    return 0;
}

