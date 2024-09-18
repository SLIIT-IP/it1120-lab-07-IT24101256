public class IT24101256Lab7Q2B
{
  public static void main(String[]args)
  {
    int i,j,k=1;
    for( i=1;i<=5;i++)
    {
     System.out.print(i+"-");
     
     for( j=1;j<=k;j++)
     {
      System.out.print("*"+" ");
     }
     System.out.println();
     k=k+1;
    }
   }
  }