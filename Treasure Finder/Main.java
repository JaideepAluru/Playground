#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
    if(b>c)
    {
      cout<<"The treasure is in box which has number "<<b;
    }
    else
    {
      cout<<"The treasure is in box which has number " <<c;
    }
  }
  else if (b>a && b>c)
  {
    if (a>c)
      cout<<"The treasure is in box which has number "<<a;
    else
      cout<<"The treasure is in box which has number "<<c;;
  }
  else
  {
    if(a>b)
      cout<<"The treasure is in box which has number "<<a;
    else
      cout<<"The treasure is in box which has number "<<b;
  }
  cout<<"\nThe code to open the box is "<<gcd(a,gcd(b,c));
}