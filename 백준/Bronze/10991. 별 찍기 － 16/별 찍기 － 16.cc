#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

	for (int i = 1; i <= n; i++)
	{
		// 왼쪽 공백
		for (int j = i; j < n; j++)
		{
			cout << " ";
		}
		// 별 찍기
		for (int j = 1; j < i * 2 ; j++)
		{
			if (j % 2 == 1) 
				cout << "*";
			else
				cout << " ";
		}
		cout << endl;
	}

    return 0;
}
