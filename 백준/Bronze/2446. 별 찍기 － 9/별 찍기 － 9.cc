#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
   
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            cout << " ";
        }
        for (int j = i*2; j < (2 * n - 1); j++) {
            cout << "*";
        }
        cout << '\n';
    }
    for (int i = 2; i <= n ; i++) {
        for (int j = i+1; j <= n; j++) {
            cout << " ";
        }
        for (int j = 0; j < (2 * i - 1); j++) {
            cout << "*";
        }
        cout << '\n';
    }
    
    return 0;
}