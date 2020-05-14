#include<iostream>
int gc(int n1,int n2)
{
    int small=0;
  int gcd=0;
  if(n1<n2)
  {
    small = n1;
  }
  else
  {
    small = n2;
  }
  while(small>=1)
  {
    if((n1%small==0)&&(n2%small==0))
    {
      gcd = small;
      break;
    }
    small--;
  }
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;
}
int main()
{
  int n1,n2,n3,a;
  std::cin>>n1>>n2;
  gc(n1,n2);
  return 0;
}
