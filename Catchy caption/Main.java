#include<iostream>
#include<string>
int main()
{
  std::string str1;
  int n;
  std::getline(std::cin,str1);
  n=str1.size();
  if(n>50)
  {
      std::cout<<"Caption not eligible for the contest";
  }
  else
  {
      std::cout<<"Caption eligible for the contest";
  }
}