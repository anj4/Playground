#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d", &n);
  int a[10];
  for(i=0;i<n;i++)
  {
    scanf("%d", &a[i]);
  }
  for(int i1=0;i1<=n-2;i1++)
  {
     for(int i2=i1+1;i2<=n-1;i2++)
  {
        for(int i3=i2+1;i3<=n-1;i3++)
  {
          printf("(%d, %d, %d) " ,a[i1], a[i2], a[i3]);
        }
     }
    printf("\n");
  }
  return 0;
}

