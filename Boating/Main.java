#include<iostream>
int main()
{
    int x,a,c,d,e,f;
    int aw = 75,cw = 30;
    std::cin>>x>>a>>c;
    d = a*aw;
    e = c*cw;
    f = d+e;
    if(f>x)
    {
        std::cout<<"Boat will drow";
    }
    else
    {
        std::cout<<"Boat is stable";
    }
}
    
    