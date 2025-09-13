#include <iostream>
#include <string>
using namespace std;

int main() {
	string name;
	getline(cin, name, '\n');	// 문자열 입력

	int length, n = 0;

	length = name.length();	 // length = name의 문자열 길이

	for (int i = 'a'; i <= 'z'; i++) {	// a부터 z까지 증가
		for (int j = 0; j < length; j++) {	// 0부터 문자열 개수만큼 증가
			if (name.at(j) == i) {	// 만약 인덱스j와 i와 같으면
				cout << j << " ";	// 출력
				n++;	// n증가
				break;	// 멈춤
			}
		}
		if (n == 0) {	// 만약 n이 0이면
			cout << "-1 ";	// -1 출력
		}
		n = 0;	// 다시 n을 0으로 바꿈
	}
	return 0;
}