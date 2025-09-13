#include <stdio.h>

int main(void)
{
    int n[31] = { 0 };
    int a;

    for (int i = 0; i < 28; i++) {  
        scanf("%d", &a); 
        n[a] = a;   
    }
    for (int i = 1; i < 31; i++) {  
        if (n[i] == 0)  
            printf("%d\n", i);      
    }


    return 0;
}