#include <stdio.h>

int main() {
	int n, a[1000000];
	int max = -1000000, min = 1000000;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);

		if (a[i] > max) {
			max = a[i];
		}
		if (a[i] < min) {
			min = a[i];
		}
	}
	printf("%d %d", min, max);

	return 0;
}