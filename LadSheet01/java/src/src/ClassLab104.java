import javax.swing.JOptionPane;
public class ClassLab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application");

        String name = JOptionPane.showInputDialog("Enter employee name:");
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter total hours for this employee:"));
        double hourlyWage = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage for this employee:"));

        double grossEarnings = hoursWorked * hourlyWage;

        double taxRate = 0.15;
        double tax = grossEarnings * taxRate;

        double netEarnings = grossEarnings - tax;

        String output = String.format(
            "Employee name: %s\nHours worked: %.1f\nHourly wage: $%.1f\nGross earnings: $%.1f\nTax rate: %.2f\nTax: $%.1f\nNet earnings: $%.1f",
            name, hoursWorked, hourlyWage, grossEarnings, taxRate, tax, netEarnings
        );
        JOptionPane.showMessageDialog(null, output);
	}

}
