#include<iostream>
int main() 
{
    int x;
	std::string str;
	std::getline(std::cin,str);
	x=str.length();
	std::cout<<"The number of letters in the name is "<<x;
	return 0;
}