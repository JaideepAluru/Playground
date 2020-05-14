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
  int a,b,c,d,e,i;
  std::cin>>a>>b>>c;
  d = power(a,b);
  if(d>=c)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
    