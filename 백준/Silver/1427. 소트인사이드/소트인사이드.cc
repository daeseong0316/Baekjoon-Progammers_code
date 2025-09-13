#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cin >> str;

    vector<char> arr;
    for (int i = 0; i < str.size(); i++) {
        arr.push_back((int)str[i]);
    }

    sort(arr.begin(), arr.end(), greater<char>());

    for (char i : arr) {
        cout << i;
    }
    return 0;
}