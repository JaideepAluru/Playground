#include<iostream>
int main()
{
  int n,a1,b1,a2,b2,x,y;
  std::cin>>n;
  std::cin>>a1>>b1>>a2>>b2;
  if(n==1)
  {
    x=a1+a2;
    y=b1+b2;
    std::cout<<x<<"+"<<y<<"i";
  }
  else if(n==2)
  {
    x=a1-a2;
    y=b1-b2;
    std::cout<<x<<"+"<<y<<"i";
  }
  else if(n==3)
  {
    x=(a1*a2)-(b1*b2);
    y=(a1*b2)+(b1*a2);
    std::cout<<x<<y<<"i";
  }
  else
    std::cout<<"Invalid choice";
}