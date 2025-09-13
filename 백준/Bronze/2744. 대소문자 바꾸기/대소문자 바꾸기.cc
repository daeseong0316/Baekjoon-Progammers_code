#include <iostream>
#include <string>
using namespace std;

int main() {
    string name;
    getline(std::cin, name);

    int length = name.length();

    for (int i = 0; i < length; i++) {
        if (name[i] >= 'A' && name[i] <= 'Z') { // 대문자인 경우
            name[i] = name[i] + 32; // 아스키 코드로 변환하여 소문자로 변경
        }
        else if (name[i] >= 'a' && name[i] <= 'z') { // 소문자인 경우
            name[i] = name[i] - 32; // 아스키 코드로 변환하여 대문자로 변경
        }
    }

    cout << name << endl;

    return 0;
}
