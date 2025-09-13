#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
	int n;
	cin >> n;

	int count = n;
	for (int i = 0; i < n; i++) {
		string str;
		cin >> str;

		bool arr[26] = { 0 };
		for (int j = 0; j < str.size(); j++) {
			if (arr[str[j] - 97] == false) {
				arr[str[j] - 97] = true;
			}
			else if (j > 0 && str.at(j) != str.at(j-1)) {
				count--;
				break;
			}
		}
	}

	cout << count;

	return 0;
}