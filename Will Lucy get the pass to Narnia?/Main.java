#include<iostream>
int main()
{
  std::cout<<"Enter first number : Enter second number : Menu\n";
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";
int a,b,num,c,d,e,f,g;
  std::cin>>a>>b>>num;
  switch(num)
  {
    case 1:
       c = a + b;
      std::cout<<c;
      break;
    case 2:
       d = a - b;
      std::cout<<d;
      break;
      case 3:
       e = a * b;
      std::cout<<e;
      break;
      case 4:
       f = a / b;
      std::cout<<f;
      break;
      case 5:
       g = a % b;
      std::cout<<g;
      break;
      default :
      std::cout<<"Invalid operation";
  }
  return 0;
}
      