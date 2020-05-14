#include<iostream>
#include<string>
using namespace std;
struct college
{
  string name;
  string city;
  int establishmentyear;
  float passpercentage;
};
int main()
{
  int n,i;
  std::cout<<"Enter the number of colleges"<<"\n";
  std::cin>>n;
  college c[n];
  for(i=0;i<n;i++)
  {
  std::cout<<"Enter the details of college "<<i+1<<"\n";
  std::cout<<"Enter name"<<'\n';
  cin>>c[i].name;
  std::cout<<"Enter city"<<'\n';
  cin>>c[i].city;
  std::cout<<"Enter year of establishment"<<'\n';
  std::cin>>c[i].establishmentyear;
  std::cout<<"Enter pass percentage"<<'\n';
  std::cin>>c[i].passpercentage;}
  cout<<"Details of colleges\n";
  for(i=0;i<n;i++){
    std::cout<<"College:"<<i+1<<"\n";
    std::cout<<"Name:"<< c[i].name <<'\n';
    std::cout<<"City:"<<c[i].city<<'\n';
    std::cout<<"Year of establishment:"<<c[i].establishmentyear<<'\n';
    std::cout<<"Pass percentage:"<<c[i].passpercentage<<'\n';
}}