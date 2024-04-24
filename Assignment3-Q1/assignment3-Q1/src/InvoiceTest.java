
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invo = new Invoice("12","mouse",20,12.5);
		double amount = invo.invoice_amount();
		System.out.println("Invoice Amount :" + amount);
	}
}
