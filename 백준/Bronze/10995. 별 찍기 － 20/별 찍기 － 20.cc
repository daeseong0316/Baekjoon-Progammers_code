#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    if (n == 1) {       // 1개 일 때
        cout << "*";
    }
    else {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {   // 홀수 줄
                for (int j = 1; j <= n; j++) {
                    cout << "*" << " ";
                }
            }
            else {  // 짝수 줄
                cout << " ";
                for (int j = 1; j <= n; j++) {
                    cout << "*" << " ";
                }
            }
            cout << '\n';
        }
    }

    return 0;
}
