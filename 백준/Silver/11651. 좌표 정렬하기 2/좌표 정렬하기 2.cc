#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<vector<int>> arr(n, vector<int>(2));
    
    for (int i = 0; i < n; i++) {
        cin >> arr[i][0] >> arr[i][1];
    }

    sort(arr.begin(), arr.end(), [](const vector<int>& a, const vector<int>& b) {
        if (a[1] == b[1]) {
            return a[0] < b[0];
        }
        return a[1] < b[1];
    });

    for (int i = 0; i < n; i++) {
        cout << arr[i][0] << " " << arr[i][1] << '\n';
    }

    return 0;
}