
public class Student {
//
	private String name;
	private double [] scores;
	
	//
	public void setStudentDayeils(String stdName,double[] stdScotes) {
		name = stdName;
		scores = stdScotes;
	}
	
	//
	public double calcuateAverageScore() {
		double total = 0;
		for (int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		return total/scores.length;
		
	}
	public  String getGrade() {
		double average = calcuateAverageScore();
		if(average >= 90) {
			return "A";			
		}else if(average >= 80) {
			return "B";			
		}else if(average >= 70) {
			return "C";			
		}else if(average >= 60) {
			return "D";			
		}else {
			return "F";	
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name: ");
		System.out.println("Scores: ");
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println("\nAverage Score: "+calcuateAverageScore());
		System.out.println("Grade; "+getGrade());
	}
}
