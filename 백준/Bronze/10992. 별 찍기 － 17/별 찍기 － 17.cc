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
        //첫 번째 줄
        for (int i = 0; i < n - 1; i++) {   // 왼쪽 공백
            cout << " ";
        }
        cout << "*" << '\n';    // 젤 위 별

        // 가운데 줄
        for (int i = 1 ; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {   // 젤 왼쪽 공백
                cout << " ";
            }
            cout << "*";    //  젤 왼쪽 공백
            for (int j = i + 2; j < (1 + i * 3); j++) {     // 사이 공백
                cout << " ";
            }
            cout << "*";    // 젤 오른쪽 별

            cout << '\n';
        }

        // 마지막 줄
        for (int i = 0; i < n + (n - 1); i++) {
            cout << "*";
        }
    }

    return 0;
}
