package sheet1.Question10;

public class Main {

	public static void main(String[] args) {
		
		Artist queen = new Artist("Queen", Genre.rock);
		
		queen.addRecord("A Night At the Opera");
		
		queen.addRecord("Hot Space", Genre.pop);
		
		queen.addRecord("A Day at the Races", Genre.rock);
		
		queen.addRecord("Innuendo", Genre.rock);
		
		System.out.println("All records by " + queen.getName() + ":");
		queen.showCatalogue();

		System.out.println("");
		
		System.out.println("All " + Genre.rock + " records by " + queen.getName() + ":");
		queen.showGenre(Genre.rock);
	}

}
