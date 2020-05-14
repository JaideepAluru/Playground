#include<iostream>
int power(int x, int y) {  
   int i, power = 1;
   if(y==0)
      return 1;
   for(i=1;i<=y;i++)
      power = power*x;
   return power;
} 
int main()
{
  int a,n,c,d,e,i;
  std::cout<<"Enter the value of a"<<"\n";
  std::cin>>a;
  std::cout<<"Enter the value of n"<<"\n";
  std::cin>>n;
  d = power(a,n);
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<d;
}