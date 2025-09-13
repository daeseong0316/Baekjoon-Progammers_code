#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;

	if (n == 4 || n == 7) {
		cout << -1;
	}
	else if (n % 5 == 0) {
		cout << n / 5;
	}
	else if (n % 5 == 1 || n % 5 == 3) {
		cout << (n / 5) + 1;
	}
	else if (n % 5 == 2 || n % 5 == 4) {
		cout << (n / 5 + 2);
	}
    return 0;
}