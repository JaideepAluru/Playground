#include<iostream>
int main()
{
  int x,y;
  std::cin>>x>>y;
  std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  x=x+y;
  y=x-y;
  x=x-y;
  std::cout<<"After swapping a= "<<x<<" and b="<<y;
}