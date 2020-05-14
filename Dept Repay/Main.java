#include<iostream>
int main()
{
	int p,t,r,a,b;
	float c,d;
	
	std::cin>>p;
	std::cin>>r;
	std::cin>>t;
	a=(p*t*r)/100;
	std::cout<<a<<"\n";
	b=p+a;
	std::cout<<b<<"\n";
	c=a*0.02;
	std::cout<<c<<"\n";
	d=b-c;
	std::cout<<d;
	
	
}