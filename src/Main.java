import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  //  Scanner for input

        System.out.print("Enter the Price of the item: "); // Ask the user to for the  item cost

        if (in.hasNextDouble()) {
            double itemCost = in.nextDouble();
            in.nextLine();


            double shippingCost;  // Add the shipping fee and total cost.
            if (itemCost >= 100.00) {
                shippingCost =0;
            } else {
                shippingCost = itemCost * 0.02;
            }
            double totalCost = shippingCost + itemCost;


            System.out.println("Total Price is : $" + totalCost); // display total cost
            System.out.println("Shipping Cost is : $" + shippingCost);//display shipping cost
        }

        in.close(); // Close the Scanner
    }
}
