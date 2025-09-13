#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    vector<int> x;
    vector<int> y;

    for (int i = 0; i < 3; i++) {
        int x1, y1;
        cin >> x1 >> y1;
        x.push_back(x1);
        y.push_back(y1);
    }

    int X = 0;
    int Y = 0;

    if (x.at(0) == x.at(1)) {
        X = x.at(2);
    }
    else if (x.at(0) == x.at(2)) {
        X = x.at(1);
    }
    else {
        X = x.at(0);
    }

    if (y.at(0) == y.at(1)) {
        Y = y.at(2);
    }
    else if (y.at(0) == y.at(2)) {
        Y = y.at(1);
    }
    else {
        Y = y.at(0);
    }

    cout << X << " " << Y;

    return 0;
}
