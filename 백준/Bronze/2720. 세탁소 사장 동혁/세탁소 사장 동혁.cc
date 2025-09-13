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
	
	int Q = 25, D = 10, N = 5, P = 1;
	for (int i = 0; i < n; i++) {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		
		int a;
		cin >> a;

		while (a > 0) {
			if (a >= Q) {
				a -= Q;
				count1++;
			}
			else if (a < Q && a >= D) {
				a -= D;
				count2++;
			}
			else if (a < D && a >= N) {
				a -= N;
				count3++;
			}
			else if (a < N && a >= P) {
				a -= P;
				count4++;
			}
		}
		cout << count1 << " " << count2 << " " << count3 << " " << count4 << '\n';
	}
    return 0;
}
