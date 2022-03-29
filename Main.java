import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("wybierz rozmiar ");
    int a= scan.nextInt();
     System.out.println("wybierz ile razy powtórzyc ");
    int p= scan.nextInt();
    char c= '*';
    for(int l=0; l<p; l++)
      {
        for (int i = 1; i<=a; i++)
        {
            for(int j=0;j<(a-i); j++)
              {
                System.out.print(" ");
              }
            for (int s = 0; s<i; s++){
              System.out.print(c);
            }
            System.out.println(" ");
        } 
      }
      
    }

}