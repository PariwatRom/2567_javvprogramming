import java.util.*;
import java.io.*;
public class Lab1101 {

	static Scanner input = new Scanner(System.in);
	
		public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		
		}
		
		public static void printHeader(int sec) {
			System.out.println("******************************************");
			System.out.println("\tList of Data for Section" +sec);
			System.out.println("******************************************");
		
		}
		
		public static void displayStudentList(int sec)throws IOException{
			try (BufferedReader readFile=new BufferedReader(new FileReader("src//txtFile//List107.txt//"))){
				String temp="";
				while ((temp = readFile.readLine())!=null) {
					String[] data = temp.split("\t");
					
					if(data.length < 6) continue ;
					
					int studentSection = Integer.parseInt(data[3]);
					
					if(studentSection==sec) {
						System.out.printf("%s %s\t%s \t%s%n ",data[0],data[2],data[3],data[5]);
					}
				}
			}
			
		}

}
