#include <iostream>
using namespace std;

void bubbleSort(int h[], int N) {
    for (int i = 0; i < N - 1; i++) {
        for (int j = 0; j < N - i - 1; j++) {
            if (h[j] > h[j + 1]) {
                // Tukar h[j] dengan h[j+1]
                int temp = h[j];
                h[j] = h[j + 1];
                h[j + 1] = temp;
            }
        }
    }
}

int main() {
	
    int h[] = {5, 3, 8, 4, 2};
    
    //lenght of h[]
    int N = sizeof(h) / sizeof(int);
    
    cout << "Array sebelum diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    bubbleSort(h, N);
    
    cout << "Array setelah diurutkan: ";
    for (int i = 0; i < N; i++) {
        cout << h[i] << " ";
    }
    cout << endl;
    
    return 0;
}

