#include <stdio.h>

int main() {
	int n;
	int a, s;

	scanf("%d %d", &n, &s);

	for (int i = 0; i < n; i++) {
		scanf("%d ", &a);
		if (a < s) {
			printf("%d ", a);
		}
	}


	return 0;
}