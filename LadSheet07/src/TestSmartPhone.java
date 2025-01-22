
public class TestSmartPhone {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		
		System.out.println("กําลังตั้งค่าข้อมูลสมาร์ทโฟนเริ่ต้น...");
		phone.setBrand("SmartMobile"); 
		phone.setModel("W1000"); 
		phone.setStorageCapacity(256); 
		
		System.out.println("\nข้อมูลสมาร์ทโฟนเบื้องต้น :");
		phone.printDetails();
		
		System.out.println("\nเพิ่มความจุหน่วยความจํา 100 GB...");
		phone.increaseStorage(100); 
		
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจํา 200 GB...");
		phone.increaseStorage(200); 
		
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจํา -50 GB...");
		phone.increaseStorage(-50); 
		
		System.out.println("\nคํานวณพื้นที่หน่วยความจําที่เหลือ โดยใช้ไปแล้ว120 GB...");
		int remainingStorage = phone.getRemainingStorage(120); 
		if (remainingStorage != -1) {
		System.out.println("พ้ืนที่ที่เหลือ: " + remainingStorage + " GB");
		}
		
		System.out.println("\nคํานวณพื้นที่หน่วยความจําที่เหลือ โดยใช้ไปแล้ว 500 GB...");
		phone.getRemainingStorage(500); 
		
		System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกตอ้ง...");
		phone.setBrand(""); 
		phone.setModel("A"); 
		
		System.out.println("\nตั้งค่าความจุหน่วยความจํา ที่ไม่ถูกต้อง...");
		phone.setStorageCapacity(600); 
		
		System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
		phone.printDetails();
	}
}
