#include <iostream>
using namespace std;

void hi() {
	ios_base::sync_with_stdio(false);
		cin.tie(NULL);
}

int main() {
	hi();
	
	int a, b;
	int n;
    
    cin >> n;
    
	for (int i=0; i<n; i++) {
		cin >> a >> b;

		if (a == 0 && b == 0) {
			break;
		}
		cout << a + b << "\n";
	}

	return 0;
}