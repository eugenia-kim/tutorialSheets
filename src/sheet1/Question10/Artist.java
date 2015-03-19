package sheet1.Question10;

import java.util.ArrayList;
import java.util.Iterator;
public class Artist {
	
	private String name;
	private ArrayList<Record> catalogue = new ArrayList<Record>();
	private Genre mainGenre;
	
	public Artist(String name, Genre mainGenre) {
		this.name = name;
		this.mainGenre = mainGenre;
	}
	
	// Add a record of the given name to the artist’s catalogue
	// Use the artist’s main genre as the record’s genre
	public void addRecord(String name) {
		catalogue.add(new Record(name, mainGenre));
	}
	
	// Add a record of the given name and genre to the artist’s
	// catalogue
	public void addRecord(String name, Genre genre) {
		catalogue.add(new Record(name, genre));
	}
	
	// Display the artist’s catalogue
	public void showCatalogue() {
		Iterator<Record> catalogueIterator = catalogue.iterator();
		while(catalogueIterator.hasNext()) {
			Record record = catalogueIterator.next();
			System.out.println(record);
		}
	}
	
	// Display the subset of artist’s catalogue
	// that falls into the given genre
	public void showGenre(Genre genre) {
		Iterator<Record> catalogueIterator = catalogue.iterator();
		while(catalogueIterator.hasNext()) {
			Record curr = catalogueIterator.next();
			if(curr.getGenre() == genre) {
				System.out.println(curr + " ");
			}
		}
		
	}
	
	public String getName() {
		return name;
	}
	
}
