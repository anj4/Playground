// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,a[100],i,large=0;
  scanf("%d", &n);
  for(i=0;i<n;i++)
  {
     scanf("%d", &a[i]);
  }
   for(i=0;i<n;i++)
  {
     if(a[i]>large)
     {
       large=i;
     }
     }
  printf("%d",large);
 return 0;
}