#include <stdio.h>
int main() 
{
    int n,arr[10],i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int prev = arr[0];
  int c_index = 1;
 int new = n;
   for(i=1;i<n;i++)
  {
     if(prev != arr[i])
     {
       prev = arr[i];
       arr[c_index] = prev;
       c_index ++;
     }
   
     else{
       new--;
     }
   }
   
  for(i=0;i<new;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}