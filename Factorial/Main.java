#include<iostream>
int fact(int x)
{
    if(x==0)
    {
        return 1;
    }
    else
    return x*fact(x-1);
}
int main()
{
    int a,b;
    std::cin>>a;
    b=fact(a);
    std::cout<<"The factorial of "<<a<<" is "<<b;
	
}