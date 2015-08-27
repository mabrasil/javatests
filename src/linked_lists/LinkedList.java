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
		if(pos == 0){
			this.addAtStart(element);
		}else if(pos == this.elementsTotal){
			this.add(element);
		}
		Cell actual = getCell(pos - 1);
		Cell nw = new Cell(element);
		nw.setNext(actual.getNext());
		actual.setNext(nw);
		elementsTotal++;
	}
	
	public Object gets(int pos){
		return this.getCell(pos).getElement();
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
	
	public String toString(){
		if(elementsTotal == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Cell actual = first;
		
		for(int i = 0; i < this.elementsTotal - 1; i++){
			builder.append(actual.getElement());
			builder.append(", ");
			actual = actual.getNext();
		}
		
		builder.append(actual.getElement());
		builder.append("]");
		
		return builder.toString();
		
	}
	
	private boolean occupiedPos(int pos){
		return pos >= 0 && pos < this.elementsTotal;
	}
	
	private Cell getCell(int pos){
		if(!this.occupiedPos(pos)){
			throw new IllegalArgumentException("Invalid Position");
		}
		
		Cell actual = first;
		for(int i = 0; i < pos; i++){
			actual = actual.getNext();
		}
		return actual;
	}
}
