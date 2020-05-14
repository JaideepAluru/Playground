#include<iostream> 
int fib(int n) 
{ 
  int a = 0, b = 1, c, i; 
  if( n == 0) 
    return a; 
  for (i = 3; i <= n; i++) 
  { 
     c = a + b; 
     a = b; 
     b = c; 
  } 
  return b; 
} 
  
int main () 
{ 
    int n,m;
    std::cin>>n;
    m=fib(n);
    std::cout<<m;
  return 0; 
}