#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d", &n);
  int arr[10];
  for(i=0;i<n;i++)
  {
    scanf("%d", &arr[i]);
  }
  int n1,n2;
  scanf("%d %d", &n1,&n2);
  int n1_i= -1;
  int n2_i= -1;
  for(i=0;i<n;i++)
  {
    if(n1==arr[i])
    {
      n1_i = i;
    }
    if(n2==arr[i])
    {
      n2_i = i;
    }
  }
  printf("%d\n",n1_i);
   printf("%d\n",n2_i);
 return 0;
}