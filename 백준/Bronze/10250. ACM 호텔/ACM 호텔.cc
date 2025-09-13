#include <iostream>
using namespace std;

int main() {
	int t;	// 입력 갯수
	int h, w, n;	// 층 수, 방 수, 몇번째 손님
	int result;	// 결과
	cin >> t;	

	for (int i = 0; i < t; i++) {	
		cin >> h >> w >> n;		

		if (n % h == 0) {	
			result = h * 100 + (n / h);
		}
		else {
			result = (n % h) * 100 + (n / h) + 1;	
		}
		cout << result << endl;
	}
}

/*
입력
2
6 12 10
30 50 72
*/