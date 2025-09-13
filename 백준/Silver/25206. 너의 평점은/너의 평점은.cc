#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
	double s_card[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
	string r_card[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	double total = 0, s_total = 0, pass = 0;

	const int subject = 20;

	for (int i = 0; i < subject; i++) {
		string name, rank;
		double score;
		cin >> name >> score >> rank;

		auto it = find(begin(r_card), end(r_card), rank);
		if (it != end(r_card)) {
			double o_score = 0, mul = 0;
			int index = distance(begin(r_card), it);
			o_score = s_card[index];
			mul = o_score * score;
			total += mul;
			s_total += score;
			pass = total / s_total;
		}
		if (rank == "P") {
			continue;
		}
	}

	printf("%.6f", pass);

	return 0;
}