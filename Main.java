import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y=0;

    if(x==0||x==1)
    {
      System.out.println("nie pierwsza");
    }
    else
    {
    for(int i=2;i<=sqrt(x);i++)
      {
        if(x%2==0)
        {
          System.out.println("nie pierwsza");
          y=1;
          break;
        }
      }
    if(y==0)System.out.println("pierwsza");
    }

    }
}