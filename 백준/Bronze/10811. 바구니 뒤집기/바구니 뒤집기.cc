#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int N, M; // N = 바구니 갯수, M = 역순 할 횟수
	int* arr = new int[100]();

	cin >> N;

	for (int q = 0; q < N; q++) {
		arr[q] = q+1;
	}

	int i, j, imsi = 0;
	cin >> M;

	for (int w = 0; w < M; w++) {
		cin >> i >> j;
		while (i < j) {
			swap(arr[i - 1], arr[j - 1]);
			i++;
			j--;
		}
	}
	for (int e = 0; e < N; e++) {
		cout << arr[e] << " ";
	}

	return 0;
}