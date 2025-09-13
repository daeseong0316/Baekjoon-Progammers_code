#include <iostream>
using namespace std;

int main() {
	int N, M;	// N = 바구니 갯수, M = 공을 바꾸는 횟수
	int i, j;	
	
	cin >> N;
	int* arr = new int[N+1]();	// 바구니 갯수 생성 후 0으로 초기화
	
	for (int q = 1; q <= N; q++) {
		arr[q] = q;
	}

	cin >> M;	// 공 바꾸는 횟수 입력

	for (int w = 1; w <= M; w++) {
		int imsi;
		cin >> i >> j;
		imsi = arr[i];
		arr[i] = arr[j];
		arr[j] = imsi;
	}

	for (int e = 1; e <= N; e++) {	
		cout << arr[e] << " ";	// 출력
	}

	delete[] arr; // 동적으로 할당한 배열은 해제

	return 0;
}