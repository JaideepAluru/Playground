#include<iostream>
#define MAX 10
using namespace std;
int findMax(int mat[100][100],int N,int M) 
{ 
    int maxElement = mat[0][0]; 
    for (int i = 0; i < N; i++) { 
        for (int j = 0; j < M; j++) { 
            if (mat[i][j] > maxElement) { 
                maxElement = mat[i][j]; 
            } 
        } 
    } 
    return maxElement; 
} 
int main() {
   int row,col,i,j;
   cin>>row>>col;
   int mat[100][100];
   for(i=0;i<row;i++)
   {
       for(j=0;j<col;j++)
       {
           cin>>mat[i][j];
       }
   }
   cout<<"The maximum element is "<<findMax(mat,row,col);
}