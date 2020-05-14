#include <iostream>
#include<cstdio>
using namespace std;

int main()
{
    int a;
    float b,c,d,e;
    cin>>a>>b;
    if(a<=3)
    {
        if(a==1)
        {
            printf("%.2f",b);
        }
        else if(a==2)
        {
            c = b/2.0;
            d = b+c;
            printf("%.2f",d);
        }
        else
        {
            e = b*2.0;
            printf("%.2f",e);
        }
    }
    else
    {
        cout<<"Number of items is more";
    }
}
