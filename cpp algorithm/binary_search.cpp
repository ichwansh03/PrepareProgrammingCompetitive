#include <iostream>
using namespace std;

int binarySearch(int h[], int N, int X) {
    int hasil = 0; // belum ditemukan
    int kiri = 1;
    int kanan = N;
    
    while (kiri <= kanan && hasil == 0) {
        int tengah = (kiri + kanan) / 2;
        if (X < h[tengah]) {
            kanan = tengah - 1;
        } else if (X > h[tengah]) {
            kiri = tengah + 1;
        } else {
            hasil = tengah;
        }
    }
    
    return hasil;
}

int main() {
    int h[] = {1,2,5,6,8,9,10,11};
    int N = sizeof(h) / sizeof(int);
    int X = 10;
    
    int posisi = binarySearch(h, N, X);
    
    if (posisi == 0) {
        cout << "Beri hadiah lain" << endl;
    } else {
        cout << "Posisi " << X << " dalam array: " << posisi << endl;
    }
    
    return 0;
}

