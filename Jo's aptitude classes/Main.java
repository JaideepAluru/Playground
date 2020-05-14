#include<iostream>
int main()
{
  int n1,n2,n3,a;
  std::cin>>n1>>n2>>n3>>a;
  int small=0;
  int gcd=0;
  if((n1<n2)&&(n1<n3))
  {
    small = n1;
  }
  else if((n1>n2)&&(n2<n3))
  {
    small = n2;
  }
  else
  {
    small = n3;
  }
  while(small>=1)
  {
    if((n1%small==0)&&(n2%small==0)&&(n3%small==0))
    {
      gcd = small;
      break;
    }
    small--;
  }
  if(small==a)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
  return 0;
}
