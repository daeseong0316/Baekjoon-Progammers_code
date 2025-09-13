#include <stdio.h>

int main() {
	int n;

	scanf("%d", &n);

	for (int i = 1; i <= 9; i++) {
		int s = n * i;
		printf("%d * %d = %d\n", n, i, s);
	}
	return 0;
}