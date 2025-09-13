#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
	char arr[101];
	cin >> arr;

	int len = strlen(arr);
	int count = 0, i = 0;
	while (i < len) {
		if (i < len - 2 && arr[i] == 'd' && arr[i + 1] == 'z' && arr[i + 2] == '=') {
			count += 1;
			i += 3;
		}
		else if (i < len - 1 && (arr[i] == 'l' || arr[i] == 'n') && arr[i + 1] == 'j') {
			count += 1;
			i += 2;
		}
		else if (i < len - 1 && arr[i] == 'c' && (arr[i + 1] == '=' || arr[i + 1] == '-')) {
			count += 1;
			i += 2;
		}
		else if (i < len - 1 && arr[i] == 'd' && arr[i + 1] == '-') {
			count += 1;
			i += 2;
		}
		else if (len - 1 && (arr[i] == 's' || arr[i] == 'z') && arr[i + 1] == '=') {
			count += 1;
			i += 2;
		}
		else {
			count += 1;
			i += 1;
		}
	}
	cout << count;
	return 0;
}