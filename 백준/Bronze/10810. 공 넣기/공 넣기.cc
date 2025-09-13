#include <iostream>
using namespace std;

int main() {
    int N, M;
    cin >> N;
    int* arr = new int[N](); // N 크기의 배열을 0으로 초기화

    cin >> M;

    for (int q = 0; q < M; q++) {
        int i, j, k;
        cin >> i >> j >> k;
        for (int w = i - 1; w < j; w++) { // 인덱스는 0부터 시작하므로 i에서 1을 빼고 j까지 반복
            arr[w] = k;
        }
    }
    for (int e = 0; e < N; e++) { // e의 범위를 0부터 N-1까지로 변경
        cout << arr[e] << " ";
    }

    delete[] arr; // 동적으로 할당한 배열은 해제해야 함

    return 0;
}