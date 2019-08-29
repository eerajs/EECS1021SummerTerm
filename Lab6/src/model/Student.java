package model;

public class Student {
	
	public String name;
	public final int MAX_NUM_COURSES = 5;
	public CourseRecord[] courses; // Each element in the array stores the address of some courseRecord objects.
	// 1. Value noc stores the number of courseRecord objects stored in the courses array.
	// 2. Value of noc denotes where in the array 'courses' is the next CourseRecord object to be stored.
	public int noc; //number of courses

	public Student(String name) {
		this.name = name;
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc = 0; // thus far zero courses registered, the next course will be stored at index 0.
	}
	
	// Version 1: Given a courseRecord to be stored directly into the course array
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c;
		this.noc ++;
	}
	
	//Version 2: given title which is sufficient to create a new courseRecord object.
	public void addCourse(String title) {
		CourseRecord c = new CourseRecord(title);
		// this.courses[this.noc] = c;
		// this.noc ++;
		this.addCourse(c);
	}
	
	// Given the time of the course, the marks returned are of that course if the course does not exist, value returned is -1.
	public int getMarks(String title) {
		int marks = -1;
		int index = this.indexOf(title);
		if(index >= 0) {
			marks = this.courses[index].getMarks();
		}
		
		return marks;
	}
	
	// Given the title of course, sets the mark of that course, if a courses does not exist, it does nothing.
	public void setMarks(String title, int marks) {
		int index = this.indexOf(title);
		if(index >= 0) {
			this.courses[index].setMarks(marks);
		}
	}
	
	// Helper method reused by getMarks and setMarks.
	// Given the title of course, return the index of the corresponding index.
	// If the title does not exist, return -1.
	public int indexOf(String title) {
		int result = -1;
		boolean found = false;
		for(int i = 0; i < this.noc && !found; i++) {
			if(found = (this.courses[i].title.equals(title))) {
				found = true;
				result = i;
			}
		}
		return result;
	}

	double getGPA() {
		double gpa = 0;
		double gp = 0;
		
		for(int i = 0; i< this.noc; i++) {
			// CourseRecord c = this.courses[i];
			// String lg = c.getLetterGrade();
			
			String lg = this.courses[i].getLetterGrade();
			if(lg.equals("A+")) {
				gp += 9;
			}
			else if(lg.equals("A")) {
				gp += 8;
			}
			else if(lg.equals("B")) {
				gp += 7;
			}
			else if(lg.equals("C")) {
				gp += 6;
			}
			else if(lg.equals("D")) {
				gp += 5;
			}
			else if(lg.equals("F")) {
				gp += 0;
			}
		}
		
		if(this.noc > 0) {
			gpa = gp/(this.noc);
		}

		return gpa;
	}
	
	public String getDescription() {
		String result = "";
		// Version 1: prints out the address array (which might be dull)
			// result += "Student " + this.name + " has registered " + this.noc + " courses:\n";
			// for(int i = 0; i < this.courses.length; i ++) {
			// result += this.courses[i] + "\n";
			// }

		// Version 2: print out the description of courses array elements(by calling getDescription from courseRecord)
			// This version may cause NullPointerException because there might be slots that contains null.
				// result += "Student " + this.name + " has registered " + this.noc + " courses:\n";
				// for(int i = 0; i < courses.length; i ++) {
				// result += this.courses[i].getDescription() + "\n";
				// }
		result += "Student " + this.name + " has registered " + this.noc + " courses: (with GPA " + this.getGPA() + "):\n";
		for(int i = 0; i < this.noc; i ++) {
			result += this.courses[i].getDescription() + "\n";
		}
		return result;
	}
}