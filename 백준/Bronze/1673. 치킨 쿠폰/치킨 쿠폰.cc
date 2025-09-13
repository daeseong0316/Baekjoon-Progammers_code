#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std;

int main() {
	int n, k;
	while (cin >> n >> k) {
		int temp = n; int count = 0;
		while (temp >= k) {
			count += temp / k;
			temp = temp / k + temp % k;
		}

		cout << n + count << '\n';
	}
	return 0;
}