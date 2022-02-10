
public class Student {
	
	int studentId;
	String studentName;
	int marks; // instance variable
	int grade;
	
	/**
	 * By default Java provides a constructor, but if you create
	 * a Parameterized constructor the default constructor will not be available.
	 */
	
	// default constructor
	public Student() {
		studentId = -1;
		studentName = "Open Entry";
		int marks = -1;
		int grade = -1;
	}
	
	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	// Parameterized constructor
	public Student(int studentId, String studentName, int marks, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}
	
	// Parameterized constructor 2
	public Student(String studentName, int marks, int grade) {
		this();
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}


	public void takeExam() {
		int marksScored = 0; // local variable
		
		System.out.println(marks);
		System.out.println(marksScored);
		
		for(int i = 1; i < 5; i++) {
			System.out.println(i);
			
		}
	}
	
	public void printStudentDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Marks: " + marks);
		System.out.println("Student Grade: " + grade);
	}
	
	public void examResults() {
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		Student n = new Student();
		n.printStudentDetails();
		
		Student s = new Student("Helen", 5, 2);
		s.printStudentDetails();
		
	
	}

}
