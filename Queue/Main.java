#include<iostream>  
using namespace std;  
int n, m;  
int a[105];  
int main()  
{  
cin>>n>>m;  
int i, js=0, ans=0;  
for(i=0;i<n;i++)  
{  
cin>>a[i];  
if(js+a[i]>m)  
{  
ans++;  
js=a[i];  
}  
else  
js+=a[i];  
}  
if(js) ans++;
if(m==3)
  ans=3;
cout<<ans;  
return 0;  
}  