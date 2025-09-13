#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
	int x;
	cin >> x;
	
    int sum = 0;	// 직전 대각선 누적합
    int cross = 1;	// 해당 대각선 개수
    while (true) {
        if (x <= sum + cross) {
            if (cross % 2 == 1) {	// 홀수인 경우
                cout << (cross - (x - sum - 1)) << "/" << (x - sum);
                break;
            }
            else {	// 짝수인 경우
                cout << (x - sum) << "/" << (cross - (x - sum - 1));
                break;
            }
        }
        else {
            sum += cross;
            cross++;
        }
    }
    return 0;
}
