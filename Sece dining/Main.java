#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  int x;
  cin>>x;
  if(s!="front")
  {
    if (x==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
    
  }
  else
  {
    if(x==1)
       cout<<"Left Handed";
    else
       cout<<"Right Handed";
  }
  
  
}