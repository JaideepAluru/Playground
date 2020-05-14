#include<iostream>
int main()
{
    int a;
    std::cin>>a;
    for(int i=1;i<=a;i++)
    {
        
        if(i%2==0)
        {
            for(int j=1;j<=a;j++)
            {
                if(j==1)
                {
                    std::cout<<i+1;
                }
                else
                {
                    std::cout<<i;
                }
            }
            std::cout<<"\n";
        }
        else
        {
            for(int j=1;j<=a;j++)
            {
                if(j==a)
                {
                    std::cout<<i+1;
                }
                else
                {
                    std::cout<<i;
                }
            }
            std::cout<<"\n";
        }
        
    }
}