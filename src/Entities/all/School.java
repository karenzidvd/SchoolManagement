package Entities.all;

import java.util.ArrayList;
import java.util.List;

public class School {
private List<Teacher> teachers;
private ArrayList<Student>students;
private static int totalMoneyEarned;
private static int totalMoneySpent;
public School(List<Teacher> teachers, ArrayList<Student> student) {
	super();
	this.teachers = teachers;
	students = student;
}
public List<Teacher> getTeachers() {
	return teachers;
}
public void setTeachers(List<Teacher> teachers) {
	this.teachers = teachers;
}
public ArrayList<Student> getStudent() {
	return students;
}
public void setStudent(ArrayList<Student> student) {
	students = student;
}

public void addTeacher(Teacher teacher) {
	teachers.add(teacher);
	
}
public void addStudent(Student student) {
	students.add(student);
}
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public static void updateTotalMoneyEarned(int MoneyEarned) {
	totalMoneyEarned+=MoneyEarned;
}
public int getTotalMoneySpent() {
	return totalMoneySpent;
}
public static void updateTotalMoneySpent(int moneySpent) {
	totalMoneyEarned-=moneySpent;
}
public static int getMoneyEarnedd() {
	return totalMoneyEarned;
}
}
