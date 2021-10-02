
public class Political implements State{
	
	Political(){
		writeBook(new AuthorMood());
	}

	@Override
	public void writeBook(AuthorMood mood) {
		 
		System.out.println("Author created Political related Book");
		
	}

}
