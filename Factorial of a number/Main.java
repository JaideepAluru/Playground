#include<iostream>
int main(){
  int a,i;
  int fact=1;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}