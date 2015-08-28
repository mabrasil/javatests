package linked_lists;

public class Cell {
	private Cell next;
	
	private Cell previous;
	
	private Object element;
	
	public Cell(Cell next, Object element){
		this.next = next;
		this.element = element;
	}
	
	public Cell(Object element){
		this.element = element;
	}
	
	public void setNext(Cell next){
		this.next = next;
	}
	
	public Cell getNext(){
		return next;
	}
	
	public Object getElement(){
		return element;
	}
	
	public Cell getPrevious(){
		return this.previous;
	}
	
	public void setPrevious(Cell previous){
		this.previous = previous;
	}
	
	
}
