#include <stdio.h>
int main() {
	int n,temp,sum;
  scanf("%d", &n);
  temp=n;
  int ld=n%10;
  while(n>10)
  {
    n=n/10;
  }
  int fd=n;
  sum=fd+ld;
  printf("%d" ,sum);
	return 0;
}