#include<iostream>
int main()
{
    int a;
    int b;
    std::cin>>a;
    b = 121;
    for(int i=1;i<=a;i++)
    {
        std::cout<<b<<" ";
        b = (11+4*i)*(11+4*i);
        
        
    }
}
    