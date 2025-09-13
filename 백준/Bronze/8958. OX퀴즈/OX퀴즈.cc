#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;

    string s;
    for (int i = 0; i < n; i++) {
        cin >> s;

        if (s.length() >= 80) {
            cout << "문자열은 0보다 크고 80보다 작은 문자열이 주어진다.";
        }

        int count = 0, sum = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s[j] == 'O') {
                count++;
            }
            else {
                count = 0;
            }
            sum += count;
        }
        cout << sum << endl;
    }

    return 0;
}