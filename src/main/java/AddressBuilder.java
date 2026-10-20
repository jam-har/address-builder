import java.util.Scanner ;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        StringBuilder billingInfo = new StringBuilder();

        System.out.println("Enter your billing information");
        System.out.print("Full name: ");
        billingInfo.append("\n" + userEntry.nextLine() + "\n");
        billingInfo.append("\nBilling address:");
        System.out.print("Street address: ");
        billingInfo.append("\n" + userEntry.nextLine());
        System.out.print("City: ");
        billingInfo.append("\n" + userEntry.nextLine());
        System.out.print("State: ");
        billingInfo.append(", " + userEntry.nextLine());
        System.out.print("Zipcode: ");
        billingInfo.append(" " + userEntry.nextLine());
        System.out.println();
        System.out.print("Enter your shipping information \n");
        billingInfo.append("\n \nShipping address:");
        System.out.print("Street address: ");
        billingInfo.append("\n" + userEntry.nextLine());
        System.out.print("City: ");
        billingInfo.append("\n" + userEntry.nextLine());
        System.out.print("State: ");
        billingInfo.append(", " + userEntry.nextLine());
        System.out.print("Zipcode: ");
        billingInfo.append(" " + userEntry.nextLine());

        String customerInfo = billingInfo.toString();
        System.out.println(customerInfo);

        userEntry.close();






    }
}
