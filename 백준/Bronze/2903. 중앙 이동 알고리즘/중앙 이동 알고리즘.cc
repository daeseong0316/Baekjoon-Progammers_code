#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
	int n, result = 0;
	cin >> n;
	
	result = pow(pow(2, n) + 1, 2);

	cout << result;
    return 0;
}
