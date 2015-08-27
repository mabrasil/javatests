package linked_lists;

public class LinkedList {
	private Cell first;
	
	private Cell last;
	
	private int elementsTotal;
	
	public void add(Object element){
		if(this.elementsTotal == 0){
			this.addAtStart(element);
		}else{
			Cell nw = new Cell(element);
			this.last.setNext(nw);
			this.last = nw;
			this.elementsTotal++;
		}
		
	}
	
	public void add(Object element, int pos){
		
	}
	
	public Object gets(int pos){
		return null;
	}
	
	public void remove(int pos){
		
	}
	
	public int size(){
		return 0;
	}
	
	public boolean contains(Object o){
		return false;
	}
	
	public void addAtStart(Object element){
		Cell nw = new Cell(this.first, element);
		this.first = nw;
		 if(this.elementsTotal == 0){
			 //empty list special case
			 this.last = this.first;
		 }
		 this.elementsTotal++;
	}
	
	public void removeFromStart(){
		
	}
	
	public void removeFromEnd(){
		
	}
}
