#include <iostream>
#include <string>
#define r 31
#define M 1234567891
using namespace std;


int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int L;
    string alphabet;
    long long hash = 0, R = 1;

    std::cin >> L >> alphabet;

    int len = alphabet.length();
    for (int i = 0; i < len; i++) {
        hash += ((alphabet[i] - 'a' + 1) * R) % M;
        hash %= M;
        R = (R * r) % M;
    }

    std::cout << hash;
    return 0;
}
