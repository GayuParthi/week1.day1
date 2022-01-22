package week1.day1;

public class Student {
int rollNumber;
String studentName;
public void college() {
	int collegeId = 1014;
	String collegeName = "Easwari engineering College";
	String deptName = "EIE";
	System.out.println("College ID is " + collegeId);
	System.out.println("College Name is "+collegeName);
	System.out.println("Department Name is "+deptName);
	globalVariable();
	
}
private void globalVariable() {
	System.out.println("Student Name is "+studentName);
	System.out.println("Student RollNumber is " + rollNumber);	
}
public static void main(String[] args) {
	Student stud = new Student();
	stud.rollNumber = 12;
	stud.studentName = "Gayathri";
	stud.college();

}
}
