package piles;

import java.util.LinkedList;
import java.util.List;

public class Pile<T> {
	private LinkedList<T> objects = new LinkedList<T>();
	
	public void insert(T t){
		this.objects.add(t);
	}
	
	public T remove(){
		return this.objects.remove(this.objects.size() - 1);
	}
	
	
	public boolean empty(){
		return this.objects.size() == 0;
	}
	
	
}
