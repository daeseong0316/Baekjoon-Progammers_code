#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std;

int main() {
	const int fan = 8;

	string a;
	int count = 0;
	for (int i = 0; i < fan; i++) {
		cin >> a;
		for (int j = 0; j < fan; j++) {
			if (a[j] == 'F' && (i + j) % 2 == 0) {
				count++;
			}
		}
	}
	cout << count;

	return 0;
}