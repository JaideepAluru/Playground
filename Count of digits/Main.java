#include<iostream>
int main()
{
  int a,c=0;
  std::cin>>a;
  do
  {
    a = a/10;
    c++;
  }while(a!=0);
  std::cout<<c;
  return 0;
}