#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int n1, n2;
    cin >> n1 >> n2;

    int sum = 0, min = 0;
    for (int i = n1; i <= n2; i++) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            if (min == 0) {
                min = i;
            }
            sum += i;
        }
    }

    if (sum == 0) {
        cout << "-1";
    }
    else {
        cout << sum << '\n' << min;
    }
        
    return 0;
}
