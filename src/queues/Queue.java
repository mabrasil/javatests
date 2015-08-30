package queues;

import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> list = new LinkedList<T>();
	
	public void insert(T t){
		this.list.add(t);
	}
	
	public T remove(){
		return this.list.remove(0);
	}
	
	public boolean empty(){
		return this.list.size() == 0;
	}
}
