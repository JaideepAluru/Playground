#include <iostream>
using namespace std;
int main()
{
    int sun,m,t,w,th,f,sat;
    int a1,b1,c1,d1,e1,f1,g1;
    int total;
    cin>>sun>>m>>t>>w>>th>>f>>sat;
    (sun<=8)?a1=sun*100+(50*sun):a1=sun*100+(50*sun)+(15*(sun-8));
    (m<=8)?b1=100*m:b1=100*m+((m-8)*15);
    (t<=8)?c1=100*t:c1=100*t+((t-8)*15);
    (w<=8)?d1=100*w:d1=100*w+((w-8)*15);
    (th<=8)?e1=100*th:e1=100*th+((th-8)*15);
    (f<=8)?f1=100*f:f1=100*f+((f-8)*15);
    (sat<=8)?g1=sat*100+(25*sat):g1=sat*100+(25*sat)+(15*(sat-8));
    total = a1+b1+c1+d1+e1+f1+g1;
    cout<<total;
}
