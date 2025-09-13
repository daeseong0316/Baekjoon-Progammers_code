#include <iostream> 
#include <string>
#pragma warning(disable : 4996)

using namespace std;

int main() {
    int T;
    int R;
    string S;

    cin >> T;
    for (int i = 0; i < T; i++) {
        cin >> R >> S;

        for (int j = 0; j < S.length(); j++) {
            for (int k = 0; k < R; k++) {
                printf("%c", S.at(j));
            }
        }
        printf("\n");
    }


    return 0;
}
