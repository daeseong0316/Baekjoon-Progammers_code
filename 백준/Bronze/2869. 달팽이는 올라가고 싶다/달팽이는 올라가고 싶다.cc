#include <iostream>
#include <string>
using namespace std;

int main() {
    int a, b, v;
    cin >> a >> b >> v;
    
    int start = 0, count = 0;
    
    count = (v - b - 1) / (a - b) + 1;

    cout << count;

    return 0;
}
