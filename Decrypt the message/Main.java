#include<iostream>
int main()
{
  int a,b,c,i,div,sum=0;
  std::cin>>a>>b;
  c = a+b;
  for (i=1; i < c; i++)
    {
        div = c % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == c)
        std::cout<<"They can read the message";
    else
        std::cout<<"They can't read the message";
    return 0;
}