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
				this.studentsTotal++;
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
		if(!busyPos(pos)){
			throw new IllegalArgumentException("Invalid Position.");
		}
		return students[pos];
	}
	
	public void remove(int pos){
		//implement
	}
	
	public int length(){
		return studentsTotal;
	}
	
	public String toString(){
		if (studentsTotal == 0){
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < studentsTotal - 1; i++){
			builder.append(this.students[i]);
			builder.append(", ");
		}
		
		builder.append(students[studentsTotal - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	public boolean check(Student student){
		for(int i = 0; i < students.length; i++){
			if(student == students[i]){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkName(String str){
		for(int i = 0; i < students.length; i++){
			if(str.equals(students[i].getName())){
				return true;
			}
		}
		return false;
	}
	
	private boolean busyPos(int i){
		return i >= 0 && i < studentsTotal;
	}


}
