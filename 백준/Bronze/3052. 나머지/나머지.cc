#include <iostream>
using namespace std;

int main() {
	int* arr = new int[10]();

	int A, count = 0, result = 0;

	for (int i = 0; i < 10; i++) {
		cin >> A;
		arr[i] = A % 42;
	}
	
	bool imsi[42] = { false };
	for (int j = 0; j < 10; j++) {
		if (!imsi[arr[j]]) {
			imsi[arr[j]] = true;
			count++;
		}
	}
	cout <<	count;

	delete[] arr;

	return 0;
}