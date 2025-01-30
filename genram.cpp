#include <iostream>
#include <random>

using namespace std;

int genram(int n)
{
    return rand()%n+1;
}
int main()
{
    srand(time(NULL));
    int n;
    cout << "Enter the highest number that can be gerenated ";
    cin >> n;
    cout << genram(n) <<endl;
}