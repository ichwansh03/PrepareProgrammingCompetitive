#include <iostream>

using namespace std;

void PARTITION(int arr[], int left, int right, int pivot) {
    int pLeft = left;
    int pRight = right;

    while (pLeft <= pRight) {
        while (arr[pLeft] <= pivot) {
            pLeft++;
        }
        while (arr[pRight] > pivot) {
            pRight--;
        }
        if (pLeft <= pRight) {
            int temp = arr[pLeft];
            arr[pLeft] = arr[pRight];
            arr[pRight] = temp;
            pLeft++;
            pRight--;
        }
    }
}

int main() {
    int arr[] = {5, 3, 8, 4, 2, 7, 1, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    int pivot = 6;

    PARTITION(arr, 0, n - 1, pivot);

    cout << "Array setelah dipartisi: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}

