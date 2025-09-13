#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std;

int main() {
	int n, m, l;
	cin >> n >> m >> l;

	vector<int> vec(n, 0);
	int first = 0, count = 0;

	vec[0] = 1;

	while (1) {
		if (vec[first] == m) {
			break;
		}
		count++;
		if (vec[first] % 2 == 0) {
			first = (first + l) % n;
		}
		else {
			first = (first - l + n) % n;
		}
		vec[first]++;
	}

	cout << count;
	return 0;
}