package data_structure_tests;

public class AddAtEnd {
	public static void main(String[]args){
		Student a1 = new Student();
		Student a2 = new Student();
		
		a1.setName("Felipe");
		a2.setName("Viviane");
		
		Vetor list = new Vetor();
		
		list.add(a1);
		list.add(a2);
		
		System.out.println(list);
	}
}
