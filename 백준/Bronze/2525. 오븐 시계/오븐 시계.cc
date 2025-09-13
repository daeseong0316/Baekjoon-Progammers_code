#include <stdio.h>

int main() {
	int a, b, c;

	scanf("%d %d", &a, &b);
	scanf("%d", &c);

	b += c;

	int m = b;
	m %= 60;
	
	if (b >= 60) {
		b /= 60;
		a += b;
	}

	if (a >= 24) {
		a -= 24;
	}

	printf("%d %d", a, m);

	return 0;
}