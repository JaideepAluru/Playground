#include<iostream>
using namespace std;
int* insertX(int n, int arr[], 
             int x, int pos) 
{ 
    int i;
    // increase the size by 1 
    n++;
  
    // shift elements forward 
    for (i = n; i >= pos; i--) 
        arr[i] = arr[i - 1]; 
  
    // insert x at pos 
    arr[pos - 1] = x; 
  
    return arr; 
} 
int main()  
{  
    int n,i,l,val;
    int a[15];
    cout<<"Enter the number of elements in the array"<<"\n";
    cin>>n;
    cout<<"Enter the elements in the array"<<"\n";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"Enter the location where you wish to insert an element"<<"\n";
    cin>>l;
  if(l>n)
  {
    cout<<"Invalid Input";
  }
  else
  {
    cout<<"Enter the value to insert"<<"\n";
    cin>>val;
    insertX(n, a, val, l); 
    cout<<"Array after insertion is"<<"\n";
    for (i = 0; i < n + 1; i++)
    {
        cout << a[i]<<"\n";
    }
  }
    return 0;
    
}  