#include<bits/stdc++.h>
using namespace std;
 
bool chkkaprekar(int n)
{
    if (n == 1)
       return true;
    int s = n * n;
    int ctr_digits = 0;
    while (s)
    {
        ctr_digits++;
        s /= 10;
    }
    s = n*n; 
    for (int r_digits=1; r_digits<ctr_digits; r_digits++)
    {
         int eq_parts = pow(10, r_digits);

         if (eq_parts == n)
            continue;
         int sum = s/eq_parts + s % eq_parts;
         if (sum == n)
           return true;
    }
    return false;
}
int main()
{
int kpno;
cin >> kpno;
chkkaprekar(kpno)? cout<<"Kaprekar Number": cout<<"Not a Kaprekar Number";
}