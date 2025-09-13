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

    int total = 0;
    bool arr[101][101] = { false };
    for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;

        for (int j = x; j < x + 10; j++) {
            for (int k = y; k < y + 10; k++) {
                if (!arr[j][k]) {
                    arr[j][k] = true;
                    total++;
                }
            }
        }
    }
    cout << total;

    return 0;
}
