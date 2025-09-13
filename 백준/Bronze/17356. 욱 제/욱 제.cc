#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
    double a, b;
    cin >> a >> b;

    double m = (b - a) / 400;

    double result = 1 / (1 + pow(10, m));

    cout << result;

    return 0;
}