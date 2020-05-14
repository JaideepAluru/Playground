#include<iostream>
int power(int x, unsigned int y) 
{ 
    if( y == 0) 
        return 1; 
    if (y%2 == 0) 
        return power(x, y/2)*power(x, y/2); 
    return x*power(x, y/2)*power(x, y/2); 
} 
  
/* Function to calculate order of the number */
int order(int x) 
{ 
    int n = 0; 
    while (x) 
    { 
        n++; 
        x = x/10; 
    } 
    return n; 
} 
  
// Function to check whether the given number is 
// Armstrong number or not 
bool isArmstrong(int x) 
{ 
    // Calling order function 
    int n = order(x); 
    int temp = x, sum = 0; 
    while (temp) 
    { 
        int r = temp%10; 
        sum += power(r, n); 
        temp = temp/10; 
    } 
  
    // If satisfies Armstrong condition 
    return (sum == x); 
} 
  
int main()
{
    int n;
    std::cin>>n;
    if(isArmstrong(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}