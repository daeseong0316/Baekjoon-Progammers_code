#include <iostream>
#include <string>
using namespace std;

int main() {
    int T;
    cin >> T;

    int arr[101][15];

    while (T--) {
        int k, n;
        cin >> k >> n;

        for (int i = 0; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0) {
                    arr[0][j] = j;
                }
                else if (j == 1) {
                    arr[i][1] = 1;
                }
                else {
                    arr[i][j] = arr[i][j-1] + arr[i - 1][j];
                }
            }
        }
        cout << arr[k][n] << endl;
    }

    return 0;
}
