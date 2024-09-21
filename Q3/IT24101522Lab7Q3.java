import java.util.Scanner;
public class IT24101522Lab7Q3 {
	public static void main(String[] args) {

	final double DISCOUNT_RATE = 0.05;


 	Scanner input = new Scanner(System.in);

	for (int i = 1; i<=5 ; i++) {
		System.out.println("Customer " + i + ":");

	System.out.print("Enter total amount: ");
	double billAmount = input.nextDouble();

	System.out.print("Enter mode of payment (c for cash, o for other): ");
	char modeofPayment = input.next().toUpperCase().charAt(0);

	
	double amountToBePaid = billAmount;
	
	double discount = 0;
	
	
	if (modeofPayment == 'C') {
		discount = billAmount * DISCOUNT_RATE;
		amountToBePaid = billAmount - discount;

	System.out.println("Discount is: " + discount);
	System.out.println("Amount to be paid: " + amountToBePaid);
	}

		else if (modeofPayment == 'O') {

		amountToBePaid = billAmount;
		System.out.println("No discount applicable");
		System.out.println("Amount to be paid: " + amountToBePaid);
		}

	else {

	System.out.println("Payment Mode is Not Valid");
	}
	System.out.println();
	}

	input.close();
 }
}


	