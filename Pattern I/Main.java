#include<iostream>
int main()
{
    int a;
    int b;
    std::cin>>a;
    b = a;
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            std::cout<<b;
        }
        
        std::cout<<"\n";
        b = b+1;
    }
    b=b-1;
    for(int k=4;k>=1;k--)
    {
        for(int l=1;l<=k;l++)
        {
            std::cout<<b;
        }
        
        std::cout<<"\n";
        b = b-1;
    }
}
    