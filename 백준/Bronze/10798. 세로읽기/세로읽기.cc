#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    const int r = 5;
    const int c = 15;
    string arr[r][c];

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            arr[i][j] = "";
        }
    }

    for (int i = 0; i < r; i++) {
        string line;
        getline(cin, line);
        for (int j = 0; j < line.length(); j++) {
            arr[i][j] = line[j];
        }
    }

    for (int j = 0; j < c; j++) {
        for (int i = 0; i < r; i++) {
            if (!arr[i][j].empty()) {
                cout << arr[i][j];
            }
        }
    }

    return 0;
}
