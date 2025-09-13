#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {
    int N;
    scanf("%d", &N);

    char N2[101] = {};
    scanf("%s", &N2);
    int count = strlen(N2);

    int sum = 0;
    for (int i = 0; i < count; i++) {
        sum += (int)N2[i] - 48;
    }

    printf("%d", sum);

    return 0;
}
