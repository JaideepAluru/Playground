#include<iostream>
using namespace std;
 
  int main()
 {
    int n;
    float num=0.0;
    int count=0;
    do
    {
        cin>>n;
        if(n<0)
        {
           num--; 
        }
        else if(n%2!=0)
        {
            count++;
            num++;
        }
        else
        {
            num=num-0.5;
        }
        
    }while((count!=3)&&(n>0));
    cout<<num;
  }
    