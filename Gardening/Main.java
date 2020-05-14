#include <iostream>

using namespace std;

int main()
{
    int r,c,t;
    cin>>r>>c>>t;
    if(((t>r)&&(t<=2*r))||((t>r*c-r*2)&&(t<=r*c-r)))
    {
        cout<<"It is a mango tree";
    }
    else
    cout<<"It is not a mango tree";
}
