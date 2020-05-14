#include<iostream>
using namespace std;
int main()
{
  std::string str1;
  std::string str;
  std::getline(std::cin,str);
  str.erase(7,4);
  str1.assign(str);
  str1.erase(21,4);
  std::cout<<str1;
}