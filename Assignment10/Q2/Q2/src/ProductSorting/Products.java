package ProductSorting;

public class Products implements Comparable<Products> {

	private int id;
	private String name;
	private String category;
	private int price;
	
	public Products() {
	}
	
	
	public Products(int id, String name, String category, int price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[ Id- "+ id + ", Name-" + name + ", Category-"+ category + ", Price-" + price +"]";
	}


	@Override
	public int compareTo(Products p) {
		return this.category.compareTo(p.category);
	}
	
//	@Override
//	public int compareTo(Products p) {
//		return this.price - p.price;
//	}

}
