#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  std::string str;
  std::string rev;
  std::string s1;
  cin>>str;
  cin>>rev;
  for(std::string::reverse_iterator
      i=str.rbegin();i!=str.rend();i++)
  {
    s1.push_back(*i);
  } 
      if(s1==rev)
        std::cout<<"It is correct";
      else
        std::cout<<"It is wrong";
}