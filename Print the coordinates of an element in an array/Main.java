#include<stdio.h>
int main()
{
  int r,c,arr[10][10];
  scanf("%d %d", &r,&c);
  int i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d", &arr[i][j]);
    }
  }
  int search,count=0;
  scanf("%d",&search);
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(arr[i][j] == search)
      {
        printf("(%d, %d)",i,j);
        count++;
      }
    }
  }
  if(count == 0)
  {
   printf("(-1, -1)");
  }
  return 0;
}
  