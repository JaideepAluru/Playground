#include<iostream>
int main() 
{
	std::string str1;
	std::string str2;
	std::getline(std::cin,str1);
	std::getline(std::cin,str2);
	if(str1==str2)
	{
	    std::cout<<"It is correct ";
	}
	else
	{
	    std::cout<<"It is wrong ";
	}
	return 0;
}