package queues;

public class Test {
	public static void main(String[] args){
		Queue<Student> students = new Queue<Student>();
		
		Student student = new Student();
		students.insert(student);
		
		Student removedStudent = students.remove();
		
		if(students.empty()){
			System.out.println("The queue is empty");
		}
		
		Queue<String> strings = new Queue<String>();
		strings.insert("Felipe");
		strings.insert("Viviane");
		
		String felipe = strings.remove();
		String viviane = strings.remove();
		
		System.out.println(felipe);
		System.out.println(viviane);
	}
}
