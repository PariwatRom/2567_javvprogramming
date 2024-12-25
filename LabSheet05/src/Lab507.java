import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for (int i=0;i<nums.length;i++) {
			String input = JOptionPane.showInputDialog("Input number"+(i+1)+":");
			nums[i] = Integer.parseInt(input);
		}
		showEven(nums);
		showOdd(nums);
	}
	    public static void showEven(int[] nums) {
	        String evenNumbers = "List of even number:\n ";
	        for (int num : nums) {
	            if (num % 2 == 0) {
	                evenNumbers += num + " ";
	            }
	        }
	        JOptionPane.showMessageDialog(null, evenNumbers.trim());
	    }

	    public static void showOdd(int[] nums) {
	        String oddNumbers = "List of odd number:\n ";
	        for (int num : nums) {
	            if (num % 2 != 0) { 
	                oddNumbers += num + " ";
	            }
	        }
	        JOptionPane.showMessageDialog(null, oddNumbers.trim());
	 
	}

}
