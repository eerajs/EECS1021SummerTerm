package model;

public class StudentManagementSystem {
	
	public final int MAX_NUM_STUDENTS = 100;
	public Student[] stud = new Student[this.MAX_NUM_STUDENTS];
	public int numStud;
	
	public void addStudent(Student s) {
		stud[this.numStud] = s;
		numStud ++;
	}
	
	public void addStudent(String title) {
		Student s = new Student(title);
		stud[this.numStud] = s;
		numStud ++;
	}
	
	public String getDescription() {
		String desc;

		if(this.numStud == 0) {
			desc = "Student management system currently stores no students.";
		}
		else {
			desc = "Student management system currently stores " + this.numStud + " students. \n";
			for(int i = 0; i < this.numStud; i++) {
				desc += this.stud[i].getDescription();
			}
		}
		return desc;
	}
	
	public Student[] getStudents() {
		Student[] result;
		result = new Student[this.numStud];
		for(int i = 0; i<this.numStud; i++) {
			result[i] = this.stud[i];
		}
		return result;
	}
	
	public int getMarks(String name, String title) {
		int marks = -1;
		if(this.indexOf(name)>= 0) {
			marks = stud[this.indexOf(name)].getMarks(title);
		}
		return marks;
	}
	
	public void setMarks(String name, String title, int marks) {
		if(this.indexOf(name)>= 0) {
			stud[this.indexOf(name)].setMarks(title, marks);
		}
	}
	
	public void addCourse(String name, CourseRecord cr) {
		if(this.indexOf(name)>= 0) {
			stud[this.indexOf(name)].addCourse(cr);
		}
	}
	
	public double getGPA(String name) {
		double gpa = 0.0;
		if(this.indexOf(name)>= 0) {
			gpa = stud[this.indexOf(name)].getGPA();
		}
		
		return gpa;
	}
	
	public int indexOf(String name) {
		int index = -1;
		boolean found = false;
		
		for(int i = 0; i < this.numStud && !found; i++) {
			if(stud[i].name.equals(name)) {
				found = true;
				index = i;
			}
		}
		
		return index;
	}
}
