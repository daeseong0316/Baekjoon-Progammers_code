#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {

    int* arr = new int[3];
    for (int i = 0; i < 3; i++) {
        cin >> arr[i];
    }

    int n = 3;
    sort(arr, arr + n);

    int max = arr[0] + arr[1];

    if (max > arr[2]) {
        cout << max + arr[2];
    }
    else {
        while (true) {
            arr[2]--;
            if (max > arr[2]) {
                cout << max + arr[2];
                break;
            }
        }
    }
    
    return 0;
}
