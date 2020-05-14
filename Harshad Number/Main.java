#include<iostream>
int main()
{
    int a,b,c,temp,sum=0;
    std::cin>>a;
    temp = a;
    for(int i=1;a>0;i++)
    {
        b = a%10;
        sum = sum+b;
        a = a/10;
    }
    c = temp%sum;
    if(c == 0)
    {
        std::cout<<"Harshad Number";
    }
    else
    {
        std::cout<<"Not Harshad Number";
    }
}