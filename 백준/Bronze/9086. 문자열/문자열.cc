#include <iostream>
#include <string>
using namespace std;

int main() {
	int T;
	cin >> T;

	cin.ignore();

	std::string input_name;
	for (int i = 0; i < T; i++) {
		std::getline(std::cin, input_name);

		if (input_name.empty()) {
			std::cout << "입력된 문자열이 없습니다." << std::endl;
			return 1;
		}

		cout << input_name.front() << input_name.back() << endl;
	}

	return 0;
}