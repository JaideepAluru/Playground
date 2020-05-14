#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  std::cout<<(a%10)+((a-(a%1000))/1000);
}