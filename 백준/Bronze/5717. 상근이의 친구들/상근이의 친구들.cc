#include <stdio.h>

int main() {
	int a = 0, b = 0;
	int sum = 0;
	for (;;) {
		scanf("%d %d", &a, &b);

		if (a == 0 && b == 0)
			break;

		sum = a + b;

		printf("%d\n", sum);
		
	}

	return 0;
}