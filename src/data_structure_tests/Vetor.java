//Related to student.java
package data_structure_tests;

import java.util.Arrays;

public class Vetor {
	private Student[] students = new Student[100];
	
	public void add(Student student){
		for(int i = 0; i < this.students.length; i++){
			if(this.students[i] == null){
				this.students[i] = student;
				break;
			}
		}
	}
	
	public void add(int pos, Student student){
		
	}
	
	public Student gets(int pos){
		//implement
	}
	
	public void remove(int pos){
		//implement
	}
	
	public int size(){
		//implement
	}
	
	public String toString(){
		return Arrays.toString(students);
	}

}
