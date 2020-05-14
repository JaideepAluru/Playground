#include<iostream>
#include<cstdlib>
int main()
{
  int n,b=0,g=0,i,j;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if((a[i]+1)%2==0)
    {
      b=b+1;
    }
    else
    {
      g=g+1;
    }
  }
  std::cout<<b<<"\n"<<g;
  return 0;
}