#include <stdio.h>
int main() {
	int n,r,sum=0,c,temp;
  scanf("%d", &n);
  temp=n;
  while(n>0)
  {
    r=n%10;
    c=r*r*r;
    sum=sum+c;
    n=n/10;
  }
  n=temp;
  if(n==sum)
  {
    printf("Armstrong Number");
  }
           else
           {
            printf("Not an Armstrong Number");
           }
	return 0;
}