
public class Student {
	//private two 
	private String studentName;
	private int studentScore;
	
	//
	public void setName(String stdName) {
		studentName = stdName;
	}
	public String getName() {
		return studentName;
	}
	
	public void  setScore(int stdScore) {
		studentScore = stdScore;
	}
	public int getScore() {
		return studentScore;
	}
	//
	public boolean checkScore() {
		if (getScore()>=0 && getScore()<=100) 
		return true;
	return false;
	//return getScore()>=0 && getScore()<=100;
	}
	
	public boolean isPass() {
		return getScore()>=50 ;
	}
	
}
