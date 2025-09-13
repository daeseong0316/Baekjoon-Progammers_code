#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;

    for (int i = 2; i <= n; i++) {
        while (n % i == 0) {
            n /= i;
            cout << i << '\n';
        }
    }

    return 0;
}
