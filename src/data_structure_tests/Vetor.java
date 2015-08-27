//Related to student.java
package data_structure_tests;

public class Vetor {
	private Object[] objects = new Object[100];
	
	private int objectsTotal = 0;
	
	
	public void add(Object object){
			space();
			objects[objectsTotal] = object;
			objectsTotal++;
	}
	
	/* realize that the list is compressed to the left,
	 * so the length of the list is the first null index.	
	 */ 
	public void add(Object object, int pos){
		space();
		if(!validPos(pos)){
			throw new IllegalArgumentException("Invalid Position");
		}
		for(int i = objectsTotal; i >= pos; i--){
			objects[i + 1] = objects[i];
		}
		objects[pos] = object;
		objectsTotal++;
	}
	
	public Object gets(int pos){
		if(!busyPos(pos)){
			throw new IllegalArgumentException("Invalid Position.");
		}
		return objects[pos];
	}
	
	public void remove(int pos){
		if(!busyPos(pos)){
			throw new IllegalArgumentException("Invalid Position");
		}
		for(int i = pos; i < objectsTotal; i++){
			objects[i] = objects[i + 1];
		}
		objectsTotal--;
	}
	
	public int length(){
		return objects.length;
	}
	
	public String toString(){
		if (objectsTotal == 0){
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < objectsTotal - 1; i++){
			builder.append(this.objects[i]);
			builder.append(", ");
		}
		
		builder.append(objects[objectsTotal - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	public boolean check(Object object){
		for(int i = 0; i < objects.length; i++){
			if(object == objects[i]){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkName(String str){
		for(int i = 0; i < objects.length; i++){
			if(str.equals(((Student) objects[i]).getName())){
				return true;
			}
		}
		return false;
	}
	
	private boolean busyPos(int i){
		return i >= 0 && i < objectsTotal;
	}
	
	private boolean validPos(int i){
		return i >= 0 && i <= objectsTotal;
	}
	
	private void space(){
		if(objectsTotal >= this.objects.length){
			Object[] newArray = new Object[this.objects.length * 2];
			for(int i = 0; i < this.objects.length; i++){
				newArray[i] = objects[i];
			}
		objects = newArray;
		}
	}


}
