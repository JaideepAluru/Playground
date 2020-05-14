#include<iostream>
#define MAX 10
using namespace std;
void largestInEachCol(int mat[100][100], int rows, int cols) {
   for (int i = 0; i < rows; i++) {
      int max_row_element = mat[i][0];
   for (int j = 1; j < cols; j++) {
      if (mat[i][j] > max_row_element)
         max_row_element = mat[i][j];
   }
   cout << max_row_element<<"\n";
   }
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
   largestInEachCol(mat, row, col);
}