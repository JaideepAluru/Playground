#include<iostream>
int main()
{
    int a;
    std::cin>>a;
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            std::cout<<i;
            if(j<=(i-1))
            {
                std::cout<<"*";
            }   
        }
        
        std::cout<<"\n";
    }
    for(int k=a;k>=1;k--)
    {
        for(int l=1;l<=k;l++)
        {
            std::cout<<k;
            if(l<=(k-1))
            {
                std::cout<<"*";
            }
        }
        
        std::cout<<"\n";
    }
}
    