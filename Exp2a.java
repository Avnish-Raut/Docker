 import java.util.Scanner;
class Exp2a
{
  public static void main(String args[]) 
     {
        int pizza=120,top=15,no_pizz,no_top;
        float tax=0.125f,bill,total;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter no.of Pizza : ");
        no_pizz=S.nextInt();
        System.out.println("Enter no.of Toppings on each pizza: ");
        no_top=S.nextInt();
        total=(pizza*no_pizz)+(no_top*top*no_pizz);
        bill=total+(total*tax);
        System.out.println("Receipt : " );
        System.out.println("Total no of pizza= "+no_pizz);
        System.out.println("Total no of toppings added ="+no_top*no_pizz);
        System.out.println("Tax on the food = 12.5% ");
        System.out.println("Bill including tax = "+bill+ " Rupees");
      }
}

