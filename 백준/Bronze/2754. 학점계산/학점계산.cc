#include <iostream>
#include <string>
using namespace std;

int main() {
    string op;
    cin >> op;

    if (op == "A+") {
        cout << "4.3";
    }
    else if (op == "A0") {
        cout << "4.0";
    }
    else if (op == "A-") {
        cout << "3.7";
    }
    else if (op == "B+") {
        cout << "3.3";
    }
    else if (op == "B0") {
        cout << "3.0";
    }
    else if (op == "B-") {
        cout << "2.7";
    }
    else if (op == "C+") {
        cout << "2.3";
    }
    else if (op == "C0") {
        cout << "2.0";
    }
    else if (op == "C-") {
        cout << "1.7";
    }
    else if (op == "D+") {
        cout << "1.3";
    }
    else if (op == "D0") {
        cout << "1.0";
    }
    else if (op == "D-") {
        cout << "0.7";
    }
    else {
        cout << "0.0";
    }

    return 0;
}
