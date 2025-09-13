#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	const int n = 5;

	int sum = 0, ave = 0;
	vector<int> arr;
	for (int i = 0; i < n; i++) {
		int num;
		cin >> num;
		arr.push_back(num);
		sum += num;
	}

	sort(arr.begin(), arr.end());

	int mid = n / 2;
	int mid_num = 0;

	ave = sum / n;
	mid_num = arr[mid];

	cout << ave << '\n';
	cout << mid_num;
    return 0;
}