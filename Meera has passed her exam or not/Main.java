#include<iostream>
int main()
{
  int n,i,h,j;
  std::cin>>n;
  int co = 0;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>h;
  for(j=0;j<n;j++)
  {
    if(h==a[j])
    {
      std::cout<<"She passed her exam";
      co = 1;
    } 
  }
  if(co==0)
  {
    std::cout<<"She failed";
  }
}