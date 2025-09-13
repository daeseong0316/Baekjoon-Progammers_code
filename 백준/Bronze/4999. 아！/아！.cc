#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <utility>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
    string speak;
    string doctor;
    cin >> speak >> doctor;

    int lensp = speak.length();
    int lendoc = doctor.length();

    if (lensp >= lendoc) {
        cout << "go";
    }
    else {
        cout << "no";
    }

    return 0;
}
