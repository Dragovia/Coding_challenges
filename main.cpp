#include <iostream>
#include <vector>
using namespace std;

int main()
{

int x, y;
int n;
vector <int> cordinates;
string instructions;

cin >> x >> y;
cin >>n;//left,right,forward.


if( x < -50 || x > 50)
    return false;


if (y < -50 || y  > 50 )
    return false;


for(int i = 0; i < n ; i++) {

        cin >> instructions;


}


    return 0;
}
