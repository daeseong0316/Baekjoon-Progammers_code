#include <iostream>
#include <vector>
using namespace std;

int main() {
    string S;   // 단어
    
    vector<string> number = { {"-1"},{"-1"},{"-1"},{"ABC"},{"DEF"},{"GHI"},{"JKL"},{"MNO"},{"PQRS"},{"TUV"},{"WXYZ"} };    // 전화기 번호
    
    cin >> S;
    
    int sum = 0;
    for (int i = 0; i < S.length(); i++)    // S의 문자열 길이만큼
        for (int j = 0; j < number.size(); j++)    // number의 사이즈 만큼 반복
            if (number[j].find(S[i]) != string::npos)   // S[i]가 존재하지 않는다면 npos를 반환한다
                sum += j;   //더하기
    
    cout << sum;    // 출력
}