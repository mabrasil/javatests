package data_structure_tests;

public class GetsPosition {
	public static void main(String[] args){
		Student test1, test2;
		test1 = new Student();
		test2 = new Student();
		
		test1.setName("Felipe");
		test2.setName("Vivine");
		
		Vetor list = new Vetor();
		
		list.add(test1);
		list.add(test2);
		
		list.gets(0);
		list.gets(1);
		
	}
}
