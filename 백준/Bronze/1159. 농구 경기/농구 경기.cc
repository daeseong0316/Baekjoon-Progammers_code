#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std;

int main() {
	int n;
	cin >> n;

	int arr[26] = { 0 };
	for (int i = 0; i < n; i++) {
		string str;
		cin >> str;

		char ch = str.at(0);
		arr[ch - 97]++;
	}

	bool result = false;
	for (int i = 0; i < sizeof(arr)/sizeof(0); i++) {
		if (arr[i] >= 5) {
			cout << (char)(i + 97);
			result = true;
		}
	}
	if (!result) {
		cout << "PREDAJA";
	}
	return 0;
}