#include <iostream>

using namespace std;

int main()
{
    int a,b,c,d,e;
    cin>>a>>b;
    if(a>b)
    {
        c = b+100;
        d=c-a;
        cout<<d;
    }
    else
    {
        e=b-a;
        cout<<e;
    }
}
