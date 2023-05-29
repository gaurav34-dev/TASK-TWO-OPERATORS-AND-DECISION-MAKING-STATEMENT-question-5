import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        if(a<0)
        {
          System.out.println("It's Over");
          break;
        }
        else{
          System.out.println("Good Going");
          continue;
        }
      }
  }
}


