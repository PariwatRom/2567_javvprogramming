
public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println("Company Name: "+ car.getcompanyName());
		System.out.println("Model Name:"+car.getmodelName());
		System.out.println("Year:"+car.getYear());
		System.out.println("mileage:"+car.getminleage());
		System.out.println();
		
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		
		System.out.println("Updated Car Details:");
		System.out.println("Company Name: "+ car.getcompanyName());
		System.out.println("Model Name:"+car.getmodelName());
		System.out.println("Year:"+car.getYear());
		
		car.setYear(1800);
		car.setCompanyName("");
		car.setModelName(null);
		
	}

}
