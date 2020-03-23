import java.util.Scanner;
class Main{
public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int b = in.nextInt();
  int e = in.nextInt();
  int p = 1;
  for(int i=1;i<=e;i++)
  {
    p = p*b;
  }
  System.out.println(p);
}
}