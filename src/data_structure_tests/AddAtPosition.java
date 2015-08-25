package data_structure_tests;

public class AddAtPosition {
	public static void main(String[] args){
		Student a1, a2, a3, a4, a5;
		a1 = new Student();
		a2 = new Student();
		a3 = new Student();
		a4 = new Student();
		a5 = new Student();
		
		a1.setName("Felipe");
		a2.setName("Viviane");
		a3.setName("Vinnie_Balde");
		a4.setName("Matheus");
		a5.setName("<3");
		
		Vetor list = new Vetor();
		
		list.add(a1);
		list.add(a2);
	
		System.out.println(list);
		
		//remove test \/
		
		list.adiciona(a5, 1); //success!!
		System.out.println(list);
		
	}
}
