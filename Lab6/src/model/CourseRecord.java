package model;

public class CourseRecord {
	
	public String title; // NOTE: String is not a primitive type, it is a reference type.
	public int marks; // Final raw marks out of 100.
	public Faculty instructor; // Stores the address of some faculty address.
	
	public CourseRecord() {
		// Version 1: no attributes will be initialized
		// Instead, each attribute will be initialized by its default value.
			// int: 0;
			// double:0.0;
			// boolean: false
		// Reference type: null (no address)
		// NOTE: If the attribute is of type String., if without being initialized, its default value is null.
	}
	
	public CourseRecord(String title) {
		this.title = title;
		// Only title attributes is initialized with input title.
		// All other attributes (mark and instructor) will have their default values.
	}
	
	public CourseRecord(String title, int marks) {
		this.title = title;
		this.marks = marks;
		
		// Only title and marks attributes are initialized with inputs 'title' and 'marks'.
		// Attribute instructor will have its default value null.
	}
	
	public String getTitle() {
		return title;
	}

	public int getMarks() {
		return marks;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	public String getLetterGrade() {
		String lg;
		
		if(this.marks >= 90) {
			lg = "A+";
		}
		else if(this.marks >= 80) {
			lg = "A";
		}
		else if(this.marks >= 70) {
			lg = "B";
		}
		else if(this.marks >= 60) {
			lg = "C";
		}
		else if(this.marks >= 50) {
			lg = "D";
		}
		else {
			lg = "F";
		}
		return lg;
	}
	
	public String getDescription() {
		// Version 1: this.instructor will give you the address of the Faculty object
			// return "Course " + this.title + " (raw marks: " + this.marks + ") has instructor " + this.instructor;
		// Version 2: this.instructor.getDescription() will give you the description of the faculty object
		
		String desc = "";
		
		if(this.instructor == null) {
			desc = "Course " + this.title + " (raw marks: " + this.marks + ") has no instructor";
			
		}
		else {
			desc = "Course " + this.title + " (raw marks: " + this.marks + " and letter grade " + this.getLetterGrade() + ") has instructor " + this.instructor.getDescription();
		}
		
		return desc;
	}
}
