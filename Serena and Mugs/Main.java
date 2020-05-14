#include <iostream>
using namespace std;
int main()
{
    int n,s,b=0,i;
    cin>>n>>s;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        
        b = b+a[i];
    }
    if(b<=s)
    {
        cout<<"YES";
    }
    else
    {
        cout<<"NO";
    }
}
