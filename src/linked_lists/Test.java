package linked_lists;

public class Test {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		String str = new String("Teste");
		Student a1 = new Student();
		a1.setName("Felipe Souza");
		Student a2 = new Student();
		a2.setName("Viviane Borges");
		
		list.add(a1);
		list.add(str);
		list.add(a2);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("Felipe Borges + Viviane Souza = " + list.get(0) +
				" e " + list.get(2));
	}
}
