#include <stdio.h>

int main(){
    int N, a[3];
    int count = 0;
    
    scanf("%d%d%d%d", &N, &a[0], &a[1], &a[2]);
    
    for (int i = 0; i < 3; i++) {
        if(a[i] - N < 0)
            count += a[i];
        else
            count += N;
    }
    printf("%d", count);
}