#include <iostream>

using namespace std;

int main()
{
    int a,b;
    float z,y;
    cin>>z>>a>>b;
    y = z*float(a);
    if(y>=b)
    {
        cout<<"Can reach";
    }
    else
    {
        cout<<"Cannot reach";
    }
    

}