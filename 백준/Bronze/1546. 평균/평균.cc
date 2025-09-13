#include <iostream>
using namespace std;

int main() {
	int N, M;	// N = 시험을 본 과목 갯수, M = 시험 점수

	cin >> N;
	int* arr = new int[N]();

	for (int i = 0; i < N; i++) {	// 시험을 본 과목 갯수
		cin >> M;
		arr[i] = M;
	}

	int max = arr[0];
	for (int j = 1; j < N; j++) {	// 최댓값 구하기
		if (max < arr[j]) {
			max = arr[j];
		}
	}

	double sum = 0;
	for (int k = 0; k < N; k++) {	// 새로 계산한 값으로 바꾸기
		sum += ((double)arr[k] * 100/ max) ;
	}
	
	double result = sum / N;	// 평균 구하기

	cout << result;

	delete[] arr;
}