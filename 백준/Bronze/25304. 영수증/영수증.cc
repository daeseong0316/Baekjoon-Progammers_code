#include <stdio.h>

int main() {
	int x, n, s = 0;
	scanf("%d", &x);
	scanf("%d", &n);
	
	for (int i = 0; i < n; i++) {
		int a, b;
		scanf("%d %d", &a, &b);

		s += a * b;
	}

	if (s == x) {
		printf("Yes");
	}
	else {
		printf("No");
	}

	return 0;
}