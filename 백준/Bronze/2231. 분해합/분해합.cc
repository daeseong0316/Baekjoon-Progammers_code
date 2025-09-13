#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

	int num;
	int imsi = 0, sum = 0;
	cin >> num;	

	for (int i = 1; i< num; i++) {	
		imsi = i;
		sum = i;

		while (imsi != 0) {
			sum += imsi % 10;
			imsi /= 10;
		}

		if (sum == num) {
			cout << i << '\n';
			return 0;
		}
	}

	cout << 0 << '\n';	
 
    return 0;
}