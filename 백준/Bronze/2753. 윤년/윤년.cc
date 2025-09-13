#include <stdio.h>

int main() {
	int op;
	
	scanf("%d", &op);
	
	if((op % 4 == 0 && op % 100 != 0) || op % 400 == 0) 
		printf("1");
	else
		printf("0");
	
			
		
			
	return 0;
}