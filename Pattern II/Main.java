#include<iostream>
int main()
{
    int a;
    int b;
    std::cin>>a;
    b = 0;
    for(int i=1;i<=a;i++)
    {
        if(i%2==0)
        {
            b= b+(i+1);
            for(int j=1;j<=i;j++)
            {
                b = b-1;
                std::cout<<b;
                if(j<=(i-1))
                {
                    std::cout<<"*";
                }
            }
            b=b+(i-1);
            std::cout<<"\n";
        }
        else
        {
            for(int l=1;l<=i;l++)
            {
                b=b+1;
                std::cout<<b;
                if(l<=(i-1))
                {
                    std::cout<<"*";
                }
            }
        
            std::cout<<"\n";
        
        }
        
    }
}
    