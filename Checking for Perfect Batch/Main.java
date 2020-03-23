import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int i;
    for(i=0;i<=n-1;i++)
    {
      arr[i] = in.nextInt();
    }
    batch_of_num(arr,n);
  }
  public static void batch_of_num(int arr[], int n)
  {
    int sum1=0, sum2=0;
    int i;
    for(i=0;i<=(n-1)/2;i++)
    {
      sum1 = sum1 + arr[i];
    }
    for(i=n/2;i<=(n-1);i++)
    {
      sum2 = sum2 + arr[i];
    }
    if(sum1 == sum2)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
    
  }
