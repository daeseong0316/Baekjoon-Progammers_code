#include <iostream>
using namespace std;

int main() {
    int piece[6];
    int result[6] = { 1, 1, 2, 2, 2, 8 };

    for (int i = 0; i < 6; i++) {
        cin >> piece[i];
        cout << result[i] - piece[i] << " ";
    }
}