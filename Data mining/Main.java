#include<iostream>
int main()
{
    int n,a,i;
    int eve=0,od=0;
    std::cin>>n;
    for(i=1;n>0;i++)
    {
        a=n%10;
        if(a%2==0)
        {
            eve=eve+a;
        }
        else
        {
            od=od+a;
        }
        n=n/10;
    }
    if(eve==od)
    {
        std::cout<<"Yes";
    }
    else
    {
        std::cout<<"No";
    }
    
}