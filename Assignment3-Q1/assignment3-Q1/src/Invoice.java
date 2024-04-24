
public class Invoice {
	String part_number; 
	String part_description;
	int quantity;
	double price_per_item;
	
	public Invoice()
	{
		
	}
	
	public Invoice(String part_number, String part_description, int quantity, double price_per_item) 
	{
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
	}
	
	public String getPart_number() 
	{
		return part_number;
	}
	public void setPart_number(String part_number) 
	{
		this.part_number = part_number;
	}
	
	
	public String getPart_description() 
	{
		return part_description;
	}
	public void setPart_description(String part_description) 
	{
		this.part_description = part_description;
	}
	
	
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
	public double getPrice_per_item() 
	{
		return price_per_item;
	}
	public void setPrice_per_item(double price_per_item) 
	{
		this.price_per_item = price_per_item;
	}
	
	public void checkPositive()
	{
		if(quantity < 0)
		{
			quantity = 0;
		}
		if(price_per_item < 0)
		{
			price_per_item = 0.0;
		}
	}
	
	public double invoice_amount()
	{
		checkPositive();
		double invoice_amount = quantity * price_per_item;
		return invoice_amount;
	}
	
	
	
}
