#include <iostream>
using namespace std;
int main() 
{
    std::string name;
  int roll,marks;
    getline(cin,name);
    cin >> roll;
    cin >> marks;
  cout<<"\n";
  cout<<"Student Details\n";
    cout << "Name: " << name;
    cout << "\nRoll: " << roll;
    cout << "\nMarks: " << marks ;
    return 0;
}