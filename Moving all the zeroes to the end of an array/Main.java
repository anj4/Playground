#include<stdio.h>
int main()
{
  int i,count=0,n;
  scanf("%d", &n);
  int a[20];
  for(i=0;i<n;i++)
  {
    scanf("%d", &a[i]);
  }
  for(i=0;i<n;i++)
  {
    if(a[i] > 0)
    {
      a[count++] = a[i];
    }
  }
  while(count < n)
  {
    a[count++] = 0;
  }
   for(i=0;i<n;i++)
   {
     printf("%d " ,a[i]);
   }
   return 0;
}