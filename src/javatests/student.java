package javatests;

public class student {
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
	
	public boolean equals(Object o){
		student other = (student)o;
		return this.name.equals(other.name);
	}
	
	
}
