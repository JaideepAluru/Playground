#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  int b[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  int s[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      s[i][j]=a[i][j]+b[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cout<<s[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  
}