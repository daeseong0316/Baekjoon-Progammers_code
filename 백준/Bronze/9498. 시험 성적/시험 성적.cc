#include <stdio.h>

int main() {
	int op;
	
	scanf("%d", &op);
	
	if(op<=100 && op>=90)
		printf("A");
	else if(op<90 && op>=80)
		printf("B");
	else if(op<80 && op>=70)
		printf("C");
	else if(op<70 && op>=60)
		printf("D");
	else 
		printf("F");
		
	return 0;
}