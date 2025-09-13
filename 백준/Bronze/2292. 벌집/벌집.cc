#include <iostream>
using namespace std;

int main() {

	int n;
	cin >> n;

	int i = 1, imsi = 1;
	while (imsi < n) {
		imsi += 6 * i;
		i++;
	}

	cout << i;

	return 0;
}