#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int n, k;
    cin >> n >> k;

    int count = 0;
    int result = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
        if (count == k) {
            result = i;
            break;
        }
    }
    cout << result;
        
    return 0;
}
