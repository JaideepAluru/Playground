#include<iostream>
int main()
{
  int n,i,h=0,j;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  h =a[0];
  for(j=1;j<n;j++)
  {
    if(h<a[j])
    {
      h = a[j];
    }
  }
  std::cout<<h;
}