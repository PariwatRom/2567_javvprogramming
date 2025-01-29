import java.security.PublicKey;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many student in classroom " );
		int numberofStudent =scan.nextInt();
		//Consume newLine character
		scan.nextLine();
		//
		Student[] students = new Student [numberofStudent];
		
		//input information
		for (int i=0; i<numberofStudent;i++) {
			students[i] = new Student();
			System.out.print("\nINPUT IFORMSTION OF STUDENT : "+(i+1));
			
			System.out.print("\nInput stdent name :");
			students[i].setName(scan.nextLine());
			//input student
			
			while(true) {
				System.out.print("Input stdent score :");
				int score = scan.nextInt();

				students[i].setScore(score);
				
				if (students[i].checkScore()) {
					break;
				}
			}
			
		}
			System.out.println("\nLIST OF PASS STUDENT (>=50) :");
			
			for(Student student : students) {
				if (student.isPass()) {
					System.out.print(">>"+student.getName()+"("+student.getScore()+")");
				}
			}
		
		public static String findGrade(int score) {
			if (score>=80) return "A";
			else if (score>=76) return "B+";
			else if (score>=70) return "B";
			else if (score>=66) return "D+";
			else if (score>=60) return "D";
			else if (score>=56) return "C+";
			else if (score>=50) return "C";
			else return "F";
		}
		
		/*public static void Line() {
			for (int i=1;i<60;i++) {
				System.out.print("-");
			}
			System.out.print();
		}*/
	}

}
