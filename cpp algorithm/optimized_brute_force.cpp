#include <iostream>
#include <unordered_set>
using namespace std;

//kompleksitas waktu: 0(n^3)
int countTriplets(int arr[], int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    count++;
                }
            }
        }
    }
    return count;
}

//kompleksitas waktu: 0(n^2 log n)
int countTripletsFast(int arr[], int n) {
    unordered_set<int> set(arr, arr + n); // inisialisasi set dengan nilai-nilai di arr
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int p = arr[i];
            int q = arr[j];
            int r = -(p + q);
            if (set.find(r) != set.end()) { // cek apakah r ada di dalam set
                count++;
            }
        }
    }
    return count;
}

int main() {
    int arr[] = { 0, -1, 2, -3, 1 };
    int n = sizeof(arr) / sizeof(arr[0]);

    int count = countTriplets(arr, n);
    cout << "Number of triplets with zero sum: " << count << endl;

	int countFast = countTripletsFast(arr, n);
	cout << "Number of triplets with zero sum: " << countFast << endl;
    return 0;
}

