#include <iostream>
#include <string>
using namespace std;

int main() {
	char Aa[3] = {0}, Bb[3] = {0};

	for (int i = 0; i < 3; i++) {
		cin >> Aa[i];
	}
	for (int i = 0; i < 3; i++) {
		cin >> Bb[i];
	}

	if (Aa[2] > Bb[2]) {
		cout << Aa[2] << Aa[1] << Aa[0];
	}
	else if (Aa[2] < Bb[2]) {
		cout << Bb[2] << Bb[1] << Bb[0];
	}
	else if (Aa[2] == Bb[2]) {
		if (Aa[1] > Bb[1]) {
			cout << Aa[2] << Aa[1] << Aa[0];
		}
		else if (Aa[1] < Bb[1]) {
			cout << Bb[2] << Bb[1] << Bb[0];
		}
		else if (Aa[1] == Bb[1]) {
			if (Aa[0] > Bb[0]) {
				cout << Aa[2] << Aa[1] << Aa[0];
			}
			else if (Aa[0] < Bb[0]) {
				cout << Bb[2] << Bb[1] << Bb[0];
			}
			else {
				cout << "두 수는 같습니다";
			}
		}
	}


	return 0;
}