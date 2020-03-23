import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int i;
      for(i=0;i<=n-1;i++)
      {
        arr[i] = in.nextInt();
      }
      int large = arr[0];
      for(i=0;i<=n-1;i++)
      {
        if(large<arr[i])
          large = arr[i];
      }
   System.out.println(large);   
    }
}