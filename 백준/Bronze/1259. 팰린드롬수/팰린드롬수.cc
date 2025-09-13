#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(const string& number) {
    int len = number.length();
    for (int i = 0; i < len / 2; i++) {
        if (number[i] != number[len - i - 1]) {
            return false;
        }
    }
    return true;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    string number;

    while (1) {
        cin >> number;

        if (number == "0") {
            break;
        }

        if (isPalindrome(number)) {
            cout << "yes" << endl;
        }
        else {
            cout << "no" << endl;
        }
    }
    return 0;
}
