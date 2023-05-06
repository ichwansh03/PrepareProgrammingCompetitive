#include <iostream>
using namespace std;

const int MAX_VALUE = 100000; // asumsikan nilai maksimum yang mungkin adalah 100000

void countingSort(int h[], int N) {
    int freq[MAX_VALUE + 1] = {0}; // inisialisasi tabel frekuensi dengan 0
    
    // Catat frekuensi kemunculan setiap nilai dalam array h
    for (int i = 0; i < N; i++) {
        int x = h[i];
        freq[x]++;
    }
    
    // Tuang kembali ke array h
    int index = 0;
    for (int i = 1; i <= MAX_VALUE; i++) {
        for (int j = 1; j <= freq[i]; j++) {
            h[index] = i;
            index++;
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
    
    countingSort(h, N);
    
    cout << "Array setelah diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    return 0;
}

