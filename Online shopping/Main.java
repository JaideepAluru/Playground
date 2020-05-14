#include <iostream>

using namespace std;

int main()
{
    int a,b,c,d,e,f,g,h,i;
    float j,k,l,m,n,o,p,q,r;
    cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
    j = float(b)/100;
    k = float(a)*j;
    l=a-k+c;
    m = float(e)/100;
    n = float(d)*m;
    o=d-n+f;
    p = float(h)/100;
    q = float(g)*p;
    r=g-q+i;
    cout<<"In Flipkart Rs."<<l<<"\n";
    cout<<"In Snapdeal Rs."<<o<<"\n";
    cout<<"In Amazon Rs."<<r<<"\n";
    if((l<=o) && (l<=r))
    {
        cout<<"He will prefer Flipkart";
    }
    else if((o<l) && (o<r))
    {
        cout<<"He will prefer Snapdeal";
    }
     else if((r<l) && (r<o))
    {
        cout<<"He will prefer Amazon";
    }
}