#include <iostream>
using namespace std;

int main()
{
    int a,b,i,d;
    int c=0;
    cin>>a;
    d = a;
    for(i=1;i<=(d-1);i++)
    {
        b=a;
        c=c+(b-1);
        a=b-1;
    }
    cout<<c;

    return 0;
}
