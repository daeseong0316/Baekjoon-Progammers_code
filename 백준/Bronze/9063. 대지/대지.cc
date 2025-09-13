#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;

    int* x = new int[n];
    int* y = new int[n];

    cin >> x[0] >> y[0];

    int maxX = x[0], maxY = y[0];
    int minX = x[0], minY = y[0];
    for (int i = 1; i < n; i++) {
        cin >> x[i];
        cin >> y[i];

        if (minX > x[i]) {	// x좌표 중 가장 작은 수
            minX = x[i];
        }
        if (maxX < x[i]) {	// x좌표 중 가장 큰 수
            maxX = x[i];
        }
        if (minY > y[i]) {	// y좌표 중 가장 작은 수	
            minY = y[i];
        }
        if (maxY < y[i]) {	// y좌표 중 가장 큰 수
            maxY = y[i];
        }
    }
    int result = (maxX - minX) * (maxY - minY);	// 사각형의 면적

    cout << result;

    return 0;
}
