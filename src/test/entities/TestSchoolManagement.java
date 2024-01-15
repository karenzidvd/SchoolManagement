package test.entities;

import java.util.ArrayList;
import java.util.List;

import Entities.all.School;
import Entities.all.Student;
import Entities.all.Teacher;

public class TestSchoolManagement {

	public static void main(String[] args) {
		Teacher joas=new Teacher(1, "Niyitegeka", 300000);
		Teacher emmy=new Teacher(2, "Bizimana", 230000);
		Teacher k=new Teacher(3, "Kamana", 145000);
		
		List<Teacher> teacherList=new ArrayList<>();
		teacherList.add(joas);
		teacherList.add(emmy);
		teacherList.add(k);
		//System.out.println(teacherList);
		//System.out.println(teacherList.get(1).getSalary());
		
		Student d=new Student(1, "David", 1);
		Student v=new Student(2, "Venant", 2);
		Student ke=new Student(3, "keren", 7);
		ArrayList<Student>studentList=new ArrayList<>();
		
		studentList.add(d);
		studentList.add(v);
		studentList.add(ke);
		School mipc=new School(teacherList, studentList);
		Teacher m=new Teacher(5, "Mary", 184567);
		mipc.addTeacher(m);
		//System.out.println(teacherList);
		
		d.Payfees(165572);
		v.Payfees(143765);
		ke.Payfees(250000);
		//System.out.println("MIPS has earned Frw "+mipc.getTotalMoneyEarned());
		//System.out.println("------Making School Pay ---");
		joas.receivedSalry(joas.getSalary());
		//System.out.println("MIPC has spent for salary "+joas.getName()"and now has Frw "+mipc.getTotalMoneyEarned());
		m.receivedSalry(m.getSalary());
		System.out.println("MIPS has earned Frw "+mipc.getTotalMoneyEarned());
		System.out.println("------Making School Pay ---");
		m.receivedSalry(joas.getSalary());
		System.out.println(m);
		
	}
}
