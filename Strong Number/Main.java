#include <stdio.h>
int main() {
	int n,r,temp,sum=0;
      scanf("%d", &n);
  temp=n;
  while(n>0)
  {
    r=n%10;
 int  fact=1;
  for(int i=r;i>=1;i--)
  {
    fact=(fact*i);
  }
    sum=sum+fact;
    n=n/10;
  }
  n=temp;
  if(n==sum)
    printf("Yes");
  else
    printf("No");
    return 0;
}