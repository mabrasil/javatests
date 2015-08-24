//Related to student.java
package data_structure_tests;

import java.util.Arrays;

public class Vetor {
	private Student[] students = new Student[100];
	
	private int studentsTotal = 0;
	
	
	public void add(Student student){
		for(int i = 0; i < this.students.length; i++){
			if(this.students[i] == null){
				this.students[i] = student;
				break;
			}
			
		}}
	
	/* realize that the list is compressed to the left,
	 * so the length of the list is the first null index.	
	 */ 
	public void adiciona(Student student){
		this.students[this.studentsTotal] = student;
		studentsTotal++;
	
	}
	
	public Student gets(int pos){
		return students[pos];
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
