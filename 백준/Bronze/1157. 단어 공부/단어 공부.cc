#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;   // 문자열 입력

    int arr[26] = { 0 };    // 알파벳 갯수를 저장할 배열 

    for (int i = 0; i < s.length(); i++) {  
        s[i] = toupper(s[i]);   // 입력한 문자열을 대문자로 변경
        arr[s[i] - 65]++;   // 아스키 코드를 이용하여 배열에 횟수 저장
    }

    int max = 0;    // 가장 많은 문자 횟수
    int imsimax = -1;   // max 인덱스 위치
    for (int j = 0; j < 26; j++) {
        if (max < arr[j]) { 
            max = arr[j];
            imsimax = j;    // 가장 많은 문자 인덱스
        }
    }

    for (int k = 0; k < 26; k++) {  // 다시 순회 하면서 
        if (k == imsimax) {     // 가장 많은 문자열을 제외 시킨다
            continue;
        }   
        if (arr[k] == max) {    // 많은 문자열의 갯수가 많은 경우 
            cout << "?";    // ? 출력
            return 0;
        }
    }

    cout << (char)(imsimax + 65);   // 가장 많은 문자를 출력

    return 0;
}