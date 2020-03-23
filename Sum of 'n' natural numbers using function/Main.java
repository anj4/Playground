#include<stdio.h>
int sum_natural(int n)
{
  int sum=0;
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main()
{
  int x;
  scanf("%d", &x);
  int a=sum_natural(x);
  x=a;
  printf("%d" ,a);
  	return 0;
}