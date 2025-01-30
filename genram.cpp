#include <iostream>
#include <random>

using namespace std;

int genram(int n)
{
    rand()%n+1;

}
main()
{
    srand(time(NULL));
    int n;
    cout << genram(n) <<endl;
}