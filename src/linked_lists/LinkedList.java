package linked_lists;

public class LinkedList {
	private Cell first;
	
	private Cell last;
	
	private int elementsTotal;
	
	public void add(Object element){
		if(this.elementsTotal == 0){
			addAtStart(element);
		}else{
			Cell nw = new Cell(element);
			this.last.setNext(nw);
			nw.setPrevious(this.last);
			this.last = nw;
			elementsTotal++;
		}
		
	}
	
	public void add(Object element, int pos){
		if(pos == 0){
			this.addAtStart(element);
		}else if(pos == elementsTotal){
			this.add(element);
		}else{
			Cell previous = this.getCell(pos - 1);
			Cell next = previous.getNext();
			Cell nw = new Cell(previous.getNext(), element);
			nw.setPrevious(previous);
			previous.setNext(nw);
			next.setPrevious(nw);
			this.elementsTotal++;
		}
	}
	
	public Object get(int pos){
		return this.getCell(pos).getElement();
	}
	
	public void remove(int pos){
		if(!this.occupiedPos(pos)){
			throw new IllegalArgumentException("Invalid position");
		}
		
		if(pos == elementsTotal - 1){
			this.removeFromEnd();
		}else if(pos == 0){
			this.removeFromStart();
		}else{
			Cell previous = this.getCell(pos - 1);
			Cell actual = previous.getNext();
			Cell next = actual.getNext();
			
			previous.setNext(next);
			next.setPrevious(previous);
			
			elementsTotal--;
		}
	}
	
	public int size(){
		return this.elementsTotal;
	}
	
	public boolean contains(Object element){
		Cell actual = this.first;
		
		while(actual != null){
			if(actual.getElement().equals(element)){
				return true;
			}
			actual = actual.getNext();
		}
		return false;
	}
	
	public void addAtStart(Object element){
		if(elementsTotal == 0){
			Cell nw = new Cell(element);
			this.first = nw;
			this.last = nw;
		}else{
			Cell nw = new Cell(this.first, element);
			this.first.setPrevious(nw);
			this.first = nw;
		}
		this.elementsTotal++;
	}
	
	public void removeFromStart(){
		if(!this.occupiedPos(0)){
			throw new IllegalArgumentException("Nothing to remove");
		}
		
		this.first = this.first.getNext();
		this.elementsTotal--;
		
		if(this.elementsTotal == 0){
			this.last = null;
		}
	}
	
	public void removeFromEnd(){
		if(!this.occupiedPos(elementsTotal - 1)){
			throw new IllegalArgumentException("Invalid Position");
		}
		if(this.elementsTotal == 1){
			this.removeFromStart();
		}
		Cell antelast = this.last.getPrevious();
		antelast.setNext(null);
		this.last = antelast;
		this.elementsTotal--;
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
