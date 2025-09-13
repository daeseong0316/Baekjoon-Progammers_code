#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int f1, f2, c, n0;
    cin >> f1 >> f2 >> c >> n0;

    if (f1 * n0 + f2 <= c * n0 && f1 <= c) {
        cout << "1";
    }
    else {
        cout << "0";
    }
    return 0;
}
