#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
	while (true) {
		int n;
		cin >> n;

		if(n == -1) {
			break;
		}

		int sum = 0;
		vector<int> vec;
		for(int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				vec.push_back(i);
			}
		}

		if (sum == n) {
			cout << n << " = ";
			for (vector<int>::size_type i = 0; i < vec.size(); i++) {
				if (i > 0) {
					cout << " + ";
				}
				cout << vec[i];
			}
			cout << '\n';
		}
		else {
			cout << n << " is NOT perfect." << '\n';
		}
	}
        
    return 0;
}
