#include <iostream>
using namespace std;

bool sosu(int n);

int main() {
	int N, a;
	int count = 0;
	cin >> N;

	if (N > 100) {
		cout << "N은 100이하 입니다.";
	}
	
	for (int i = 0; i < N; i++) {
		cin >> a;
		if (sosu(a) == 1) {
			count++;
		}
	}

	cout << count;

	return 0;
}
bool sosu(int n) {
	bool imsi = true;

	if (n == 1) {
		return false;
	}

	for (int i = 2; i < n; i++) {
		if (n % i == 0) {
			imsi = false;
			break;
		}
	}

	return imsi;
} 