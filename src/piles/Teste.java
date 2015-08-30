package piles;

public class Teste {
	public static void main(String[]args){
		Pile<Piece> pile = new Pile<Piece>();
		
		Piece piece = new Piece();
		pile.insert(piece);
		
		Piece removePiece = pile.remove();
		
		if(pile.empty()){
			System.out.println("The pile is empty");
		}
		
		Pile<String> pile2 = new Pile<String>();
		pile2.insert("Felipe");
		pile2.insert("Viviane");
		
		String amor = pile2.remove();
		String muito = pile2.remove();
		
		System.out.println(amor);
		System.out.println(muito);
		
			
	}
}
