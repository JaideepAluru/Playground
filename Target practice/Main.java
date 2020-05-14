#include<iostream>
using namespace std;
 
  int main()
 {
    int n,m;
    cin>>m;
    int num=0;
    int count=0;
    do
    {
        cin>>n;
        if(num<m)
        {
           num = num+n;
           count++;
        }
        
    }while(num<m);
    cout<<"The number of turns is "<<count;
  }
    