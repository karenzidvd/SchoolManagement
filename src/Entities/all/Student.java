package Entities.all;

import java.security.PublicKey;



public class Student
{
	// TODO Auto-generated constructor stub
private int id;
private String  name;
private int grade;
private int feesPaid;
private int feesTotal;

public Student(int id, String name, int grade) {
	this.feesPaid=0;
			this.feesTotal=166625;
			this.id=id;
			this.name=name;
			this.grade=grade;
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
public void setName(String name) {
	this.name = name;
}

public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public void Payfees(int fees) {
	feesPaid+=fees;
	School.updateTotalMoneyEarned(feesPaid);
}
public int getRemainingFees() {
	return feesTotal-feesPaid;
}

@Override
public String toString() {
	return "Student [name=" + name + ", feesPaid=" + feesPaid + "]";
}

}

