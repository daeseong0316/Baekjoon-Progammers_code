#include <iostream>
using namespace std;

int main() {
    int N, M;

    cin >> N >> M;
    
    int** arr1 = new int* [N];
    for (int i = 0; i < N; ++i) {
        arr1[i] = new int[M];
    }
    int** arr2 = new int* [N];
    for (int i = 0; i < N; ++i) {
        arr2[i] = new int[M];
    }
    int** sum = new int* [N];
    for (int i = 0; i < N; ++i) {
        sum[i] = new int[M];
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            sum[i][j] = 0;
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            std::cin >> arr1[i][j];
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            std::cin >> arr2[i][j];
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            std::cout << sum[i][j] << " ";
        }
        std::cout << endl;
    }

    for (int i = 0; i < N; ++i) {
        delete[] arr1[i];
        delete[] arr2[i];
        delete[] sum[i];
    }
    delete[] arr1;
    delete[] arr2;
    delete[] sum;

    return 0;
}