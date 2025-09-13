#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    string n;
    int b;
    cin >> n >> b;

    int sum = 0;
    int temp = 1;
    for (int i = n.size() - 1; i >= 0; i--) {
        char c = n[i];
        
        if (c >= 'A' && c <= 'Z') {
            sum += (c - 'A' + 10) * temp;
        }
        else {
            sum += (c - '0') * temp;
        }
        temp *= b;
    }
    cout << sum;

    return 0;
}
