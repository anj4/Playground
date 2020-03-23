import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i] = in.nextInt();
      }
      int val = in.nextInt();
      subset_of_num(n,a,val);
    }
  public static void subset_of_num(int n , int a[], int val)
  {
    for(int i=0;i<=n-1;i++)
    {
      for(int j =i+1;j<=n-1;j++)
      {
        int sum = a[i] + a[j];
        if(sum == val)
        {
          System.out.println(a[i] + "," + " " + a[j]);
        }
      }
    }
  }
}