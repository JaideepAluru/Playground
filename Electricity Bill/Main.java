#include<iostream>
int main()
{
    int x,a,c,d,e;
    std::cin>>x;
    if(x<=200)
    {
        a = x*0.5;
        std::cout<<"Rs."<<a;
    }
    else if(x<=400)
    {
        c = x*0.65+100;
        std::cout<<"Rs."<<c;
    }
    else if(x<=600)
    {
        d = x*0.80+200;
        std::cout<<"Rs."<<d;
    }
    else
    {
        e = x*1.25+425;
        std::cout<<"Rs."<<e;
    }

}
    
    
