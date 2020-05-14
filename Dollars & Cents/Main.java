#include<iostream>
int main()
{
    int a,b,c,d,e,f;
    std::cin>>a>>b>>c>>d;
    e = a+c;
    f = b+d;
    if(f>100)
    {
        e = e+1;
        f = f-100;
    }
    std::cout<<e<<"\n"<<f;
}