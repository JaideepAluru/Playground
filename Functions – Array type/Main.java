#include <iostream>
using namespace std;
int main()
{
    int n,i,b=0,c=0;
    cout<<"Enter the number of elements in the array"<<"\n";
    cin>>n;
    int a[n];
    cout<<"Enter the elements in the array"<<"\n";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        if(a[i]%2==0)
        {
            b++;
        }
        else
        {
            c++;
        }
    }
    if(b==n)
    {
        cout<<"The array is Even"<<"\n";
    }
    else if((b>0)&&(c>0))
    {
        cout<<"The array is Mixed"<<"\n";
    }
    else
    {
        cout<<"The array is Odd"<<"\n";
    }
}
