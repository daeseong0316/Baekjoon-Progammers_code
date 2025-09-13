#include <iostream>
#include <string>
using namespace std;

int main() {
    int n[8];

    for (int i = 0; i < 8; i++) {
        cin >> n[i];
    }

    bool ascending = true;
    bool descending = true;

    for (int i = 0; i < 7; i++) {
        if (n[i] < n[i + 1]) {
            descending = false;
        }
        else if (n[i] > n[i + 1]) {
            ascending = false;
        }
    }

    if (ascending) {
        cout << "ascending";
    }
    else if (descending) {
        cout << "descending";
    }
    else {
        cout << "mixed";
    }


    return 0;
}