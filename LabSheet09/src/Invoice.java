
public class Invoice {
	private int invID;
	private Customer customer;
	private double amount ;
	
	public  Invoice(int invID,Customer customer,double amount) {
		this.invID = invID;
		this.customer = customer;
		this.amount = amount;
	}
	public int getInvoiceid() {
		return this.invID;
	}
	public int getID(){
		return this.invID;
	}

	public double getAmount(){
		return this.amount;
	}
	
	public void   setAmount(double amount){
		this.amount = amount;
	}
	
	public void setCustomer (Customer customer){
		this.customer = customer;
	}
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public int  getCustomerID() {
		return this.getCustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return this.getCustomer().getDiscount();
	}
	
	public double getAmounAfterDiscount() {
		return this.getAmount() - (this.getAmount()*this.getCustomerDiscount()/100);
	}
	
	public String toString() {
		return "Invoice[id= ]" + this.getInvoiceid()+
				",customer="+ customer.toString() +
				",amoun= "+ this.getAmounAfterDiscount()+"]";
	}
		



}
