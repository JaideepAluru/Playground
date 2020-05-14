#include <iostream>
struct Distance{
  int f;
  float i;
}d1 , d2, sum;
int main()
{
  std::cin >> d1.f;
  std::cin >> d1.i;
  std::cin >> d2.f;
  std::cin >> d2.i;
  sum.f = d1.f+d2.f;
  sum.i = d1.i+d2.i;
  if(sum.i > 12)
  {
    ++ sum.f;
    sum.i -= 12;
  } 
  std::cout<< sum.f <<"'-"<< sum.i<<'"';
}