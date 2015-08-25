package data_structure_tests;

public class AddAtEnd {
	public static void main(String[]args){
		Student a1 = new Student();
		Student a2 = new Student();
		Student a3 = new Student();
		Student a4 = new Student();
		Student a5 = new Student();
		
		a1.setName("Felipe");
		a2.setName("Viviane");
		a3.setName("Matheus");
		a4.setName("Murilo");
		a5.setName("Vinicius");
		
		Vetor list = new Vetor();
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		System.out.println(list);
		System.out.println(list.length());
		
		StringBuilder builder = new StringBuilder();
		builder.append(list.gets(0));
		builder.append(" e ");
		builder.append(list.gets(1));
		builder.append(" se amam.");
		
		System.out.println(builder);
			
		
	}
}
