#include<iostream>
#include <cstdlib>
#include<cmath>
int main()
{
	int a,b,c,d,e,f,g,h;
	std::cin>>a;
	std::cin>>b;
	c=3;
	d=4;
	e = abs(a-c);
	f = abs(b-d);
	h=e*e+f*f;
	g = sqrt(h);
	std::cout<<g;
}