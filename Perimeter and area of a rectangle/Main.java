#include<stdio.h>
int main()
{
  int length=6,breadth=9,perimeter,area;
  perimeter=2*(length+breadth);
  area=length*breadth;
  printf("The perimeter of the rectangle is: %d cm\n" ,perimeter);
   printf("The area of the rectangle is: %d sq cm\n" ,area);
  return 0;
}