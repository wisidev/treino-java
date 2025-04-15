package entities;

public class Employee002 {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		this.percentage = grossSalary * (percentage / 100);
		return (grossSalary + this.percentage) - tax;
	}
}
