import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y=0;
    for(int i=2;i<=sqrt(x);i++)
      {
        if(x%2==0)
        {
          System.out.println("nie pierwsza");
          break;
        }
        else
        {
          y++;
        }
        }
    if(y==x/2)
    {
      System.out.println("pierwsza");
    }
  }
}