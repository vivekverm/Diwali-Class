import java.util.Scanner;

public class CustomerPurchase {
    int C_number;
    String C_Name;
    String C_surname;
    String Product;
    float Price;
    int Quantity;

}
class Printing extends CustomerPurchase
{
    Scanner s=new Scanner(System.in);
    public void C_Details()
    {
        System.out.println("Enter the Name of the Customer");
        C_Name=s.next();
        System.out.println("Enter the Surname");
        C_surname=s.next();
        System.out.println("Enter the Customer number");
        C_number=s.nextInt();
        System.out.println();
    }
    public void C_Purchase()
    {
        System.out.println(" Product Name");
        Product=s.next();
        System.out.println(" Price of the Product");
        Price=s.nextInt();
        System.out.println("Quantity of the Product");
        Quantity=s.nextInt();
        double TAX=.15*Price;
        double comm=.085*Price;
        double Dis=.1*Price;
        double Total;
        System.out.println("Total Price"+((Price+TAX)-(Dis+comm)));
    }

    public static void main(String[] args) {
        Printing obj=new Printing();
        obj.C_Details();
        obj.C_Purchase();
    }

}
