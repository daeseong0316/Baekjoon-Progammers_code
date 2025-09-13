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
        for (int i = 1; i <= n * 2; i++) {  // 세로 줄
            if (i % 2 == 1) {   // 홀수 줄 
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        cout << "*";
                    }
                    else {
                        cout << " ";
                    }
                }
            }
            else {     // 짝수 줄 
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0) {
                        cout << "*";
                    }
                    else {
                        cout << " ";
                    }
                }
            }
            cout << '\n';
        }
    }

    return 0;
}
