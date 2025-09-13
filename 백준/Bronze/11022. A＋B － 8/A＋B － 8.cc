#include <stdio.h>

int main() {
	int t, sum = 0;
	int a, b;
	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		scanf("%d %d", &a, &b);
		sum = a + b;
		printf("Case #%d: %d + %d = %d\n", i+1, a, b, sum);
	}
	return 0;
}