#include<stdio.h>
int square(int num)
{
  int c;
  c=num*num;
  return c;
}
int main()
{
  int n;
  scanf("%d", &n);
    int c=square(n);
  n=c;
  printf("%d" ,c);
  return 0;
}