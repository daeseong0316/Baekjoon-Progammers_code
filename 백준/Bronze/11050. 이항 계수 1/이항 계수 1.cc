#include <iostream>
using namespace std;

int main() {
    int n, k;
    int n1 = 1, k1 = 1;

    cin >> n >> k;

    if (k < 0 || k > n) {
        cout << 0;
    }
    else {
        for (int i = 1; i <= n; i++) {
            n1 *= i;
        }
        for (int i = 1; i <= k; i++) {
            k1 *= i;
        }
        int nk = 1;
        for (int i = 1; i <= n - k; i++) {
            nk *= i;
        }

        int result = n1 /(k1 * nk);

        cout << result;
    }



    return 0;
}