#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int n, x;
	cin >> n >> x;

	vector<int> arr;
	for (int i = 0; i < n; i++) {
		int num;
		cin >> num;
		arr.push_back(num);
	}

	sort(arr.begin(), arr.end());

	int x_num = n - x;
	int score = arr[x_num];

	cout << score;
    return 0;
}