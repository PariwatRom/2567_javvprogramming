
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double minleage;
	
	///
	Car(){
	/*	companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		minleage = 0.0; */
		this("Unknow","Unknow",2000,0.0);
	}
	//
	Car(String compamyName,String modelName,int year,double minleage){
		this.companyName = compamyName;
		this.modelName = modelName;
		//
		this.year = year<1886? 2000:year;
		this.minleage = minleage;
	}
	public   String getcompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		if (companyName !=null && !companyName.trim(). isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: invalid company name !");
		}
		
	}
	public   String getmodelName() {
		return modelName;
	}
	
	public void  setModelName(String modelName){
		if (modelName !=null && !modelName.trim(). isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: invalid company name !");
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (year>1886) {
			this.year = year;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	public double getminleage() {
		return minleage;
	}
	
}
