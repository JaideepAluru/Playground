#include <iostream>
#include<cstdio>

using namespace std;

int main()
{
    int a,b,c,d,e,f;
    float z,y,x,w;
    cin>>a>>b>>c>>d;
    e = d/6;
    f = d%6;
    z = float(f)/10.0;
    y = float(e)+z;
    x = float(b)/50.0;
    w = float(c)/y;
    cout<<"50"<<"\n";
    cout<<y<<"\n";
    printf("%.1f",w);
    cout<<"\n";
    printf("%.1f",x);
    cout<<"\n";
  if(w > x)
    {
        cout<<"Eligible to Win";
    }
    else
    {
        cout<<"Not Eligible to Win";
    }
}