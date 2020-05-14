#include<iostream>
int main()
{
    int a;
    int b;
    std::cin>>a;
    b = 0;
    for(int i=2;i<=a+1;i++)
    {
        std::cout<<b<<" ";
        if(i%2==0)
        {
            b = (i*i)-2;
        }
        else
        {
            b = (i*i)-1;
        }
        
        
    }
}
    