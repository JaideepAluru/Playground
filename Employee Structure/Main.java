#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char name[50],designation[50];
  int id,age,salary;
  std::cout<<"Enter name:"<<'\n';
  std::cin>>name;
  std::cout<<"Enter ID:"<<'\n';
  std::cin>>id;
  std::cout<<"Enter age:"<<'\n';
  std::cin>>age;
  std::cout<<"Enter designation:"<<'\n';
  std::cin>>designation;
  std::cout<<"Enter Salary:"<<'\n';
  std::cin>>salary;
  std::cout<<"Employee Details"<<'\n';
  std::cout<<"Name of the Employee : "<<name<<'\n';
  std::cout<<"ID of the Employee : "<<id<<'\n';
  std::cout<<"Age of the Employee : "<<age<<'\n';
  std::cout<<"Designation of the Employee : "<<designation<<'\n';
  std::cout<<"Salary of the Employee : "<<salary<<'\n';
}