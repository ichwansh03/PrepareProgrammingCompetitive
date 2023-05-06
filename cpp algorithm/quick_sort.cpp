#include <iostream>
using namespace std;

void QUICKSORT(int arr[], int left, int right){
	if (left >= right){
		return;
	} 
	else {
		int pivot = arr[(left + right)/2];
		
		int pleft = left;
		int pright = right;
		
		while (pleft <= pright){
			while (arr[pleft] <= pivot){
				pleft++;
			}
			while (arr[pright] > pivot){
				pright--;
			}
			
			if (pleft <= pright){
				int temp = arr[pleft];
				arr[pleft] = arr[pright];
				arr[pright] = temp;
				pleft++;
				pright--;
			}
		}
		
		if (pright < pleft){
			QUICKSORT(arr, left, pright);
		} else {
			QUICKSORT(arr, pleft, right);
		}
	}
}

int main(){
	int arr[] = {1,2,3,10,8,4,6,5};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	QUICKSORT(arr, 0, n-1);
	
	for (int i = 0; i < n; i++){
		cout <<arr[i]<<" ";
	}
}
