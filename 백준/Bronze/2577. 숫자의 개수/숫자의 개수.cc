#include <iostream>
#include <string>
using namespace std;

int main() {
   int A, B, C;
   int result = 0;
   cin >> A >> B >> C;
   
   if (A < 100 && A >= 1000 && B < 100 && B >= 1000 && C < 100 && C >= 1000) {
      cout << "A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.";
   }

   result = A * B * C;
   
   int count[10] = { 0 };

   while (result > 0) {   
      int digit = result % 10; // 일의 자리 숫자를 구함   
      count[digit]++; // 해당 숫자의 등장 횟수를 증가
      result /= 10; // 한 자리씩 줄여나감
   }

   for (int i = 0; i <= 9; i++) {
      cout << count[i] << "\n";
   }

   return 0;
}