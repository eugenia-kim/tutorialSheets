package sheet1.Question10;

public class Record {

	private String title;
	private Genre genre;
	
	public Record(String title, Genre genre) {
		this.title = title;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		if (genre == Genre.jazz) {
			return "Record: " + title + " jazz";
		} else if (genre == Genre.pop) {
			return "Record: " + title + "pop";
		} else {
			return "Record: " + title + "rock";
		}
	}
	
	public Genre getGenre() {
		return genre;
	}
	
}
