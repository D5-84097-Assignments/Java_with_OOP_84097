package app.com.fruits;

public class Fruit 
{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit ()
	{
		
	}
	
	public Fruit(String color, double weight, String name, boolean isFresh) 
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String toString()
	{
		return "Name-" + name + ", Color-" + color + ", isFresh-" + isFresh + ", weight-" + weight;
	}
	
	public String taste()
	{
		return "No specific taste";
	}
	
}
