
public class Customer {
	private int id;
	private String name;
	private int discoint;
	
	Customer(int id,String name ,int discoint){
		this.id = id;
		this.name = name;
		this.discoint = discoint;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discoint;
	}
	
	public void setDiscoint(int discoint) {
		this.discoint = discoint;
	}
	
	public String toString () {
		return getName() + "(" + getID() +")" +" (" + getDiscount() + "%)";
	}
	
}
