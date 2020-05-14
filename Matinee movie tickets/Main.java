#include <iostream>
using namespace std;

int main()
{
    int a;
    float b,c,d,e,f,g;
    cin>>a>>b;
    g=13.30;
    if(a>13)
    {
        if(b == g)
        {
            c=5.00;
            cout<<"$"<<c<<".00";
        }
        else
        {
            d=8.00;
            cout<<"$"<<d<<".00";
        }
    }
    else
    {
      if(b == g)
        {
            e=2.00;
            cout<<"$"<<e<<".00";
        }
        else
        {
            f=4.00;
            cout<<"$"<<f<<".00";
        }  
    }
}
