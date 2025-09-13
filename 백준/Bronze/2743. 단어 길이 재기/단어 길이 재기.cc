#include <iostream>
#include <string>
using namespace std;

int main() {
	char name[101];
	std::cin.getline(name, 101);

	int length = 0;
	for (int i = 0; name[i] != '\0'; i++) {
		length++;
	}

	cout << length;

	return 0;
}