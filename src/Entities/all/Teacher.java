package Entities.all;

public class Teacher {
private int id;
private String name;
private int salary;
private int salaryEarned;
public Teacher(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.salaryEarned=0;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setNameString(String nameString) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getSalaryEarned() {
	return salaryEarned;
}
public void setSalaryEarned(int salaryEarned) {
	this.salaryEarned = salaryEarned;
}
//key method  
public void receivedSalry(int salary) {
	if(School.getMoneyEarnedd()>salary) {
		
	this.salaryEarned+=salary;
	School.updateTotalMoneySpent(salary);
}
else {
	System.out.println("No enough money for this payment");
	}
}
public String toString() {
	return "Name of the teacher: "+this.name+"\nTotal salary earned so far Frw: "+this.salaryEarned;
}
}
