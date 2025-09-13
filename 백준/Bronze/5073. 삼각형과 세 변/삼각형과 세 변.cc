#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    while (true) {
        int n1, n2, n3;
        cin >> n1 >> n2 >> n3;

        if (n1 == 0 && n2 == 0 && n3 == 0) {
            break;
        }

        int nn1 = n2 + n3;	// 7
        int nn2 = n1 + n3;	// 8
        int nn3 = n1 + n2;	// 5

        if (n1 >= nn1 || n2 >= nn2 || n3 >= nn3) {
            cout << "Invalid" << '\n';
        }
        else if (n1 == n2 && n2 == n3 && n1 == n3) {
            cout << "Equilateral" << '\n';
        }
        else if (n1 == n2 || n2 == n3 || n1 == n3) {
            cout << "Isosceles" << '\n';
        }
        else if (n1 != n2 && n2 != n3 && n1 != n3) {
            cout << "Scalene" << '\n';
        }
    }

    return 0;
}
