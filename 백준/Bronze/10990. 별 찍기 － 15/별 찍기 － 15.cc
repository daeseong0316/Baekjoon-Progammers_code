#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    if (n == 1) {
        cout << "*";
    }
    else {
        for (int i = 0; i < n - 1; i++) {
            cout << " ";
        }
        cout << "*";
        cout << '\n';
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cout << " ";
            }
            cout << "*";
            for (int j = i + 2; j < (1 + i * 3); j++) { 
                cout << " ";
            }
            cout << "*";

            cout << '\n';
        }

    }

    return 0;
}