#include <iostream>
using namespace std;

int N, K;
int a[100];

bool optimizedSolve(int i, int sum) {
    if (i > N) {
        if (sum == K) {
            return true;
        } else {
            return false;
        }
    }
    if (sum > K) {
        return false;
    }
    bool option1 = optimizedSolve(i + 1, sum + a[i]); // Pilih elemen ai
    bool option2 = optimizedSolve(i + 1, sum); // Tidak pilih elemen ai
    return option1 || option2;
}


int main() {
    // Inisialisasi N, K, dan a
    cin >> N >> K;
    for (int i = 1; i <= N; i++) {
        cin >> a[i];
    }

    // Panggil fungsi solve dan tampilkan hasilnya
    if (optimizedSolve(1, 0)) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }

    return 0;
}

