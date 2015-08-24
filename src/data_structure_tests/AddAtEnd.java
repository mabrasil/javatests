package data_structure_tests;

public class AddAtEnd {
	public static void main(String[]args){
		Student a1 = new Student();
		Student a2 = new Student();
		Student a3 = new Student();
		Student a4 = new Student();
		
		a1.setName("Felipe");
		a2.setName("Viviane");
		a3.setName("Matheus");
		a4.setName("Murilo");
		
		Vetor list = new Vetor();
		
		list.add(a1);
		list.add(a2);
		list.adiciona(a3);
		list.adiciona(a4);
		
		System.out.println(list);
	}
}
